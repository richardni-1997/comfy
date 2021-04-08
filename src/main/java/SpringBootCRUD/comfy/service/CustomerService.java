package SpringBootCRUD.comfy.service;

import java.util.List;

import SpringBootCRUD.comfy.model.Customer;

public interface CustomerService {
	List <Customer> getAllCustomers();
	void saveCustomer(Customer customer);
	Customer getCustomerById(long id);
//	void deleteCustomerById(long id);
}
