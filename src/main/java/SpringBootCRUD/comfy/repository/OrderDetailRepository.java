package SpringBootCRUD.comfy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import SpringBootCRUD.comfy.model.OrderDetail;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
	
	//query for who and what time the order was placed.
//	@Query("SELECT employee.id, name , orderdetail.id, products, date"
//			+ "FROM orderdetail"
//			+ "JOIN employee ON employeeid = employee.id"
//			+ "ORDER BY DATE_PART('week', date);")
//	List <OrderDetail> get();
	
}
