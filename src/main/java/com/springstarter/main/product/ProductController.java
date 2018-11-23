package com.springstarter.main.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	@CrossOrigin(origins="http://localhost:4200")
	public List<Product> getAllProduct(){
		return productService.getAllProducts();
	}
	
	@RequestMapping(value="/products",method=RequestMethod.POST)
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@RequestMapping(value="/products",method=RequestMethod.PUT)
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.GET)
	public Optional<Product> getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}

}
