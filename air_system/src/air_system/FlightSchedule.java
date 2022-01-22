package air_system;

public class FlightSchedule extends FlightDiscription{
	private String date;
	static int flight_index;
	public FlightSchedule(String date,Airport from,Airport to,int capacity) {
		this.date=date;
		super.flight_ID=flight_index;
		flight_index++;
		
		System.out.println("new flight added with id= "+ flight_ID);
		super.from=from;
		super.from.increase_numof_flight();
		super.to=to;
		super.capacity=capacity;
	}
	public void set_date(String d) {
		date = d;
	}

	public String get_date() {
		return date;
	}
	
	protected void finalize() {
		super.from.decrease_numof_flight();
	}
}

