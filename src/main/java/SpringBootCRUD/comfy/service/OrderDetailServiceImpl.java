package SpringBootCRUD.comfy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import SpringBootCRUD.comfy.model.OrderDetail;
import SpringBootCRUD.comfy.repository.OrderDetailRepository;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	@Override
	public List<OrderDetail> getAllOrders() {
		return orderDetailRepository.findAll();
	}
	
	@Override
	public void saveOrder(OrderDetail orderDetail) {
		this.orderDetailRepository.save(orderDetail);
	}
}
