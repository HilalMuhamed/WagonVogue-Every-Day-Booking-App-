package com.cse.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cse.demo.model.Product;
import com.cse.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	public ProductRepository rep;
	public List <Product> getAllProducts(){
		return rep.findAll();
	}
	public String saveProduct(Product product) {
		rep.save(product);
		return "SERVICE ADDED"; 
	}
	public Product getProductById(int id) {
		Optional <Product> product =rep.findById(id);
		return product.orElse(null);
	}
	public String deleteProductById(int id) {
		if(rep.existsById(id))
		{
			rep.deleteById(id);
			return "SERVICE REMOVED";
		}
		else
		{
			return "SERVICE NOT FOUND OR UNAVAILBLE..PLEASE TRY AGAIN!!";
		}	
	}
	public String updateProductById(int id,Product updatedProduct) {
		Optional <Product> productOptional =rep.findById(id);
		if(productOptional.isPresent()) {
			Product existingProduct=productOptional.get();
		//	existingProduct.setId(updatedProduct.getId());
			existingProduct.setName(updatedProduct.getName());
			existingProduct.setServices(updatedProduct.getServices());
			existingProduct.setRate(updatedProduct.getRate());
			existingProduct.setFeatures(updatedProduct.getFeatures());
			existingProduct.setRating(updatedProduct.getRating());
			existingProduct.setSeats(updatedProduct.getSeats());
			existingProduct.setTimein(updatedProduct.getTimein());
			existingProduct.setTimeout(updatedProduct.getTimeout());
			existingProduct.setImage(updatedProduct.getImage());
			rep.save(existingProduct);
			return "SERVICE IS UPDATED";
			
		}
		else
		{
			return "SERVICE NOT FOUND OR UNAVAILBLE..PLEASE TRY AGAIN!!";
		}
		
	}

}