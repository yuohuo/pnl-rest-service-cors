package assessment.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import assessment.model.Order;
import assessment.model.Passenger;

public class OrderService {
	private List<Order> orderList = new ArrayList<Order>();

    /**
     * Generate Order Object List
     * @return Order Object List
     */
	public List<Order> getOrder() {

        InputStreamReader fr = null;
        BufferedReader br = null;

        final String nameIndicator = ".R/";
        final String recordIndicator = ".L/";
        final String trimIndicator = "-";
        try {
            InputStream in = getClass().getResourceAsStream("/PNL.txt");
            fr = new InputStreamReader(in);
            br = new BufferedReader(fr);
			String s = null;
			while ((s = br.readLine()) != null) {
				if (s.indexOf(nameIndicator) == -1) {
					String orderId = s.substring(s.indexOf(recordIndicator) + 3);
					Passenger passenger = new Passenger();
					passenger.setName(s.substring(1, s.indexOf(trimIndicator)));
					Order or = findOrder(orderId);
					if (or != null) {
						or.getPassengerList().add(passenger);

					} else {
						or = new Order();
						or.setOrderId(orderId);
						or.getPassengerList().add(passenger);
						orderList.add(or);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return orderList;
	}

    /**
     *find existing order record and add name under it
     * @param orderId
     * @return Order Object
     */
	private Order findOrder(String orderId) {
		if (orderList.isEmpty()) {
			return null;
		}
		for (Order order : orderList) {
			if (orderId.equals(order.getOrderId())) {
				return order;
			}
		}
		return null;
	}
}
