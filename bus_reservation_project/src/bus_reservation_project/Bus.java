package bus_reservation_project;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	private String busName;//get and set
	
	Bus(int no,boolean ac,int cap , String bus_name){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
		this.busName = bus_name;
	}
	
	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getBusNo(){ //accessors
		return busNo;
	}
	
	public boolean isAc(){
		return ac;
	}
	public int getCapacity(){ //accessor method
		return capacity;
	}
	
	public void setAc(boolean val) { //mutators
		ac = val;
	}
	
	public void setCapacity(int cap) { //mutator
		capacity = cap;
	}
	
	public void displayBusInfo(){
		System.out.println("Bus No:" + busNo +"Bus_Name:" + busName + " Ac:" + ac + " Total Capacity: " + capacity);
	}

	
}

