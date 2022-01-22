package air_system;

public class FlightDiscription {
	protected int flight_ID;
	protected Airport from;
	protected Airport to;
	protected int capacity=0;

	public void set_ID(int i) {
		if (i > 0) // protect the id from negative data.
			flight_ID = i;
	}

	public int get_ID() {
		return flight_ID;
	}

	public void set_from(Airport f) {
		from = f;
		f.increase_numof_flight();
	}

	public Airport get_from() {
		return from;
	}

	public void set_to(Airport t) {
		to = t;
	}

	public Airport get_to() {
		return to;
	}

	public void set_capacity(int capacity) {
		if (capacity > 0) // protect the id from negative data.
			this.capacity = capacity;
	}

	public int get_capacity() {
		return capacity;
	}	

	
}
