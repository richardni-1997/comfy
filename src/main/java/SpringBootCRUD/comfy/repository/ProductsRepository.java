package SpringBootCRUD.comfy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBootCRUD.comfy.model.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

}
