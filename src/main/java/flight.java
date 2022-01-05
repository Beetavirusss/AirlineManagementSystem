
/**
 * @author abeeha
 *
 */
public class flight {
	
	private int highestFare;
	private int availableSeats;
	private int unavailableSeats;
	private int seatNum;
	private int size;
	private boolean[] seat;
	private int capacity=100;
	private int bookedseats;
	
	public flight() 
	{}
	
    public flight (int b, int c, int LOWESTFARE, int HIGHESTFARE, int AVAILABLESEATS, int UNAVAILABLESEATS, int SEATNUM, int SIZE, boolean[] SEAT) 
	{
		lowestFare=LOWESTFARE;
	    highestFare=HIGHESTFARE;
	    availableSeats=AVAILABLESEATS;
		unavailableSeats=UNAVAILABLESEATS;
		seatNum=SEATNUM;
		size=SIZE;
		seat=SEAT;
		capacity=c;
		bookedseats=b;
	}
    
    private int lowestFare;
	public int getLowestFare() {
		return lowestFare;
	}

	public void setLowestFare(int lowestFare) {
		this.lowestFare = lowestFare;
	}

	public int getHighestFare() {
		return highestFare;
	}

	public void setHighestFare(int highestFare) {
		this.highestFare = highestFare;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public int getUnavailableSeats() {
		return unavailableSeats;
	}

	public void setUnavailableSeats(int unavailableSeats) {
		this.unavailableSeats = unavailableSeats;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean[] getSeat() {
		return seat;
	}

	public void setSeat(boolean[] seat) {
		this.seat = seat;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getBookedseats() {
		return bookedseats;
	}

	public void setBookedseats(int bookedseats) {
		this.bookedseats = bookedseats;
	}


	public boolean checkAvailabilty()
	{
		return bookedseats < capacity;
		
	}
	
	public void incrementBookingCounter()
	{
		bookedseats++;
	}
    
    
}
