package assessment.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Passenger> passengerList;
    public Order(){
    	passengerList = new ArrayList<Passenger>();
    }
	public String getOrderId() {
		return orderId;
	}

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}
