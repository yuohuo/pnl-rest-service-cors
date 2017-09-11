package assessment;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import assessment.model.Order;
import assessment.model.Passenger;
import assessment.service.OrderService;



public class OrderServiceTest {
	@Test 
	public void testGetOrderList() throws Exception {
         OrderService oser = new OrderService();
         List<Order> orderList = new ArrayList<Order>();
         orderList = oser.getOrder();
         for(Order order:orderList){
        	 System.out.println("order NO:"+order.getOrderId());
        	 for(Passenger passen:order.getPassengerList()){
        		 System.out.println("passenger:"+passen.getName());
        	 }
        	 System.out.println("***************************************************");

         }
	}
}
