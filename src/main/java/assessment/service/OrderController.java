package assessment.service;

import java.util.ArrayList;
import java.util.List;

import assessment.model.Order;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    
//    private final AtomicLong counter = new AtomicLong();
//    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin
    @GetMapping("/orderList")
    public List<Order> orderList() {

        OrderService orderServ = new OrderService();
        List<Order> orderList = new ArrayList<Order>();
        orderList = orderServ.getOrder();

        return orderList;

    }

}
