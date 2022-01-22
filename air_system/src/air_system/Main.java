package air_system;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static HashMap<Integer, FlightSchedule> flights = new HashMap<Integer, FlightSchedule>();
	static HashMap<Integer, Airport> airports = new HashMap<Integer, Airport>();
	static HashMap<Integer, Passenger> passengers = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		operations.append_airport("cairo");
		operations.append_airport("alex");
		operations.append_airport("dubai");

		operations.append_flight("15/12/2022", 0, 1, 100);
		operations.append_flight("15/6/2022", 2, 1, 50);
		operations.append_flight("15/7/2022", 0, 2, 150);

		operations.append_passenger(1, "ahmed", "cairo.shobra");
		operations.append_passenger(2, "mostafa", "cairo.mezalat");
		operations.append_passenger(0, "mohamed", "cairo.6 Octoper");

		while (true) {
			System.out.println(" * welcom to my airline system * ");
			if (dealing_with_user.main_task()) {
			} else {
				System.out.println(" system is restarted beacouse of wrong input ");
				continue;
			}
		}
	}

}

class dealing_with_user {
	static boolean main_task() {
		System.out.print("admin? or agent? ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if (input.equals("admin")) {
			if (admin_task()) {
			} else {
				return false;
			}
		} else if (input.equals("agent")) {
			if (agent_task()) {

			} else {
				return false;
			}
		} else {
			System.out.println("wrong input not admin nor agent");
			return false;
		}

		return true;
	}

	static boolean admin_task() {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out
				.print("append airport?,append flight?, query?, remove_passenger?,remove_airport? or remove_flight? ");
		input = sc.nextLine();
		int id;
		if (input.equals("airport")) {
			System.out.print("please enter its name: ");
			input = sc.nextLine();
			operations.append_airport(input);
		} else if (input.equals("flight")) {
			System.out.print("please enter its date: ");
			input = sc.nextLine();
			System.out.print("enter the id of its airport fly from: ");
			int from_id = Integer.parseInt(sc.nextLine());
			System.out.print("enter the id of its airport flay to: ");
			int to_id = Integer.parseInt(sc.nextLine());
			System.out.print("please enter its capacity: ");
			int capacity = Integer.parseInt(sc.nextLine());
			operations.append_flight(input, from_id, to_id, capacity);
		} else if (input.equals("query")) {
			operations.print_all_airports(Main.airports);
			operations.print_all_flights(Main.flights);
			operations.print_all_passengers(Main.passengers);
		} else if (input.equals("remove_airport")) {
			System.out.println("Inter ID :");
			id = Integer.parseInt(sc.nextLine());
			operations.remove_airport(id);
		} else if (input.equals("remove_flight")) {
			System.out.println("Inter ID :");
			id = Integer.parseInt(sc.nextLine());
			operations.remove_flight(id);
		} else if (input.equals("remove_passenger")) {
			System.out.println("Inter ID :");
			id = Integer.parseInt(sc.nextLine());
			operations.remove_passenger(id);
		} else {
			System.out.println("wrong input not append nor remove");

			return false;
		}
		return true;

	}

	static boolean agent_task() {
		Scanner sc = new Scanner(System.in);
		String input;

		System.out.print("query? or booking? ");
		input = sc.nextLine();
		if (input.equals("query")) {
			operations.print_all_flights(Main.flights);
		} else if (input.equals("booking")) {
			System.out.println("enter your name: ");
			input = sc.nextLine();
			System.out.println("enter your adress: ");
			String ad = sc.nextLine();
			System.out.println("enter flight id: ");
			int flight_id = Integer.parseInt(sc.nextLine());
			operations.append_passenger(flight_id, input, ad);
		} else {
			System.out.println("wrong input not query nor booking");
			return false;
		}
		return true;
	}
}

class operations {

	static void append_flight(String date, int from_airport_id, int to_airport_id, int capacity) {
		Main.flights.put(FlightSchedule.flight_index, new FlightSchedule(date, Main.airports.get(from_airport_id),
				Main.airports.get(to_airport_id), capacity));
	}

	static void remove_flight(int flight_index) {
		Main.flights.remove(flight_index);
		System.out.println("flight removed");

	}

	static void append_airport(String s) {
		Main.airports.put(Airport.airport_index, new Airport(s));
	}

	static void remove_airport(int airport_index) {
		Main.airports.remove(airport_index);
		System.out.println("airport removed");

	}

	static void append_passenger(int flight_id, String name, String ad) {
		Main.passengers.put(Passenger.passenger_index, new Passenger(Main.flights.get(flight_id), name, ad));
	}

	static void remove_passenger(int passenger_index) {
		Main.passengers.remove(passenger_index);
		System.out.println("passenger removed");

	}

	static void print_all_flights(HashMap<Integer, FlightSchedule> flights) {
		System.out.println("\n Flights:");
		System.out.println("ID		|From		|To			|Date		|Capacity");
		for (FlightSchedule url : flights.values()) {
			System.out.println(url.get_ID() + "\t\t" + url.get_from().get_airport_name() + "\t\t"
					+ url.get_to().get_airport_name() + "\t\t\t" + url.get_date() + "\t" + url.get_capacity());
		}

	}

	static void print_all_airports(HashMap<Integer, Airport> airports) {
		System.out.println("\n Airports :");
		System.out.println("ID		|Name		|Num of Flights");
		for (Airport url : airports.values()) {
			System.out
					.println(url.get_airport_id() + "\t\t" + url.get_airport_name() + "\t\t" + url.get_numof_flights());
		}
	}

	static void print_all_passengers(HashMap<Integer, Passenger> passengers) {
		System.out.println("\n passengers :");
		System.out.println("ID		|Name		|adress			Flight_ID");
		for (Passenger url : passengers.values()) {
			System.out.println(url.get_id() + "\t\t" + url.get_name() + "\t\t" + url.get_adress() + "\t\t"
					+ url.get_flight().get_ID());
		}
	}
}
