package SpringBootCRUD.comfy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import SpringBootCRUD.comfy.model.OrderDetail;
import SpringBootCRUD.comfy.service.OrderDetailService;

@Controller
public class OrderDetailController {

	@Autowired
	private OrderDetailService orderDetailService;
	
	@GetMapping("/order")
	public String viewOrdersPage(Model model) {
		model.addAttribute("listOrders", orderDetailService.getAllOrders() );
		return "orderdetail";
	}
	
	@PostMapping("/saveOrder")
	public String saveOrder(@ModelAttribute("orderdetail") OrderDetail orderDetail) {
		orderDetailService.saveOrder(orderDetail);
		return "redirect:/order";
	}
	
	@GetMapping("/showNewOrderForm")
	public String showNewOrderForm(Model model) {
		OrderDetail orderDetail = new OrderDetail();
		model.addAttribute("orderdetail", orderDetail);
		return "new_order";
	}
	
	
	
	
	
}
