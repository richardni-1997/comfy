package SpringBootCRUD.comfy.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import SpringBootCRUD.comfy.model.OrderDetail;

public interface OrderDetailService {
	List <OrderDetail> getAllOrders();
	void saveOrder(OrderDetail orderDetail);
	List <OrderDetail> findOrderById(long id);
}
