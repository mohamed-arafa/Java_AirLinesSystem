package air_system;

public class Airport {
	private String airport_name;
	private int numberof_flights;
	private int airport_ID;
	static int airport_index;
	Airport(String name){
		airport_name=name;
		airport_ID=airport_index;
		airport_index++;
		System.out.println("new airport added with id= "+ airport_ID);
	}
	
	public void set_airport_name(String n) {
		airport_name = n;
	}

	public String get_airport_name() {
		return airport_name;
	}
	
	public void set_airport_name(int id) {
		airport_ID = id;
	}

	public int get_airport_id() {
		return airport_ID;
	}
	
	public int get_numof_flights() {
		return numberof_flights;
	}

	public void increase_numof_flight() {
		numberof_flights++;
	}
	public void decrease_numof_flight() {
		numberof_flights--;
	}
}
