package SpringBootCRUD.comfy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import SpringBootCRUD.comfy.service.OrderDetailService;

@Controller
public class OrderDetailController {

	@Autowired
	private OrderDetailService orderDetailService;
	
	@GetMapping("/order")
	public String viewHomePage(Model model) {
		model.addAttribute("listOrders", orderDetailService.getAllOrders() );
		return "orderdetail";
	}
	
	@GetMapping("/orderadd")
	public String orderByIdByWeek(Model model) {
		model.addAttribute("listOrders", orderDetailService.getAllOrders() );
		return "orderdetail";
	}
	
	
	
	
}
