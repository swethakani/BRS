package busReservationSystem;

public class Bus {
	private int busno;
	private boolean acBus;
	private int capacity;
	
	public Bus(int busno,boolean acBus,int capacity) {
		this.busno=busno;
		this.acBus=acBus;
		this.capacity=capacity;
	}
	
	public int getBusNo(){ //accessors
		return busno;
	}
	
	public boolean isAc(){
		return acBus;
	}
	public int getCapacity(){ //accessor method
		return capacity;
	}
	
	public void setAc(boolean val) { //mutators
		acBus = val;
	}
	
	public void setCapacity(int cap) { //mutator
		capacity = cap;
	}
}
