package utilities;

public class Car {
    private int cap;
    private int location;
    private int revenue;
    private int carTime;
    public int getCarTime() {
		return carTime;
	}

	public void setCarTime(int carTime) {
		this.carTime = carTime;
	}

	private int[] passengerLocation = new int[5];
	public Car(){
		passengerLocation = new int[5];
		cap= 5;
    }
    public void setCap(int cap) {
        this.cap = cap;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public void setPassengerLocation(int[] passengerLocation) {
        this.passengerLocation = passengerLocation;
    }

    public int getCap() {
        return cap;
    }

    public int getLocation() {
        return location;
    }

    public int getRevenue() {
        return revenue;
    }

    public int[] getPassengerLocation() {
        return passengerLocation;
    }
    public void passengerLocationReset(){
    	for(int i=0;i<10;i++){
    		passengerLocation[i]=0;
    	}
    }

}
