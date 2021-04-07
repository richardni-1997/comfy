package SpringBootCRUD.comfy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBootCRUD.comfy.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
