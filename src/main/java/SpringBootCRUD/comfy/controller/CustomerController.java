package SpringBootCRUD.comfy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import SpringBootCRUD.comfy.model.Customer;
import SpringBootCRUD.comfy.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public String viewCustomerPage(Model model) {
		model.addAttribute("listCustomers", customerService.getAllCustomers());
		return "customer";
	}
	
	@GetMapping("/showNewCustomerForm")
	public String showNewCustomerForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "new_customer";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customer";
	}
	
	@GetMapping("/customerUpdateForm/{id}")
	public String customerUpdateForm(@PathVariable(value = "id") long id, Model model) {
		Customer customer = customerService.getCustomerById(id);
		
		model.addAttribute("customer", customer);
		return "update_customer";
	}
	
}
