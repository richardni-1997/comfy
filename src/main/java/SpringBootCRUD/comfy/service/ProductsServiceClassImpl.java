package SpringBootCRUD.comfy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootCRUD.comfy.model.Products;
import SpringBootCRUD.comfy.repository.ProductsRepository;

@Service
public class ProductsServiceClassImpl implements ProductsService{
	
	@Autowired
	private ProductsRepository productsRepository;
	
	@Override
	public List<Products> getAllProducts(){
		return productsRepository.findAll();
	}
	
}
