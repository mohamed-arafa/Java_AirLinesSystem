package air_system;

public class Passenger extends Person{	
	private FlightSchedule flight;
	private int passenger_ID;
	static int passenger_index;
	
	Passenger(FlightSchedule flight,String name,String ad){
		this.flight=flight;
		super.adress=ad;
		super.Name=name;
		passenger_ID=passenger_index;
		passenger_index++;
		System.out.println("new passenger added with id= "+ passenger_ID);
		
	}
	public void set_flight(FlightSchedule flight) {
		this.flight=flight;
	}
	public FlightSchedule get_flight() {
		return flight;
	}
	
	public void set_id(int i) {
		passenger_ID=i;
	}
	public int get_id() {
		return passenger_ID;
	}

}
