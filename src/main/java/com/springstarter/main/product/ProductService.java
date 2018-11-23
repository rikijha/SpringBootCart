package com.springstarter.main.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	
 @Autowired
 private ProductRepository productRepository;
 
 public List<Product> getAllProducts(){
	 List<Product> list=new ArrayList<>();
	 productRepository.findAll().forEach(list::add);
	 return list;
 }
 
 public void addProduct(Product product) {
	 productRepository.save(product);
 }
 
 public void updateProduct(Product product) {
	 productRepository.save(product);
 }
 
 public void deleteProduct(int id) {
	 productRepository.deleteById(id);
 }
 
 public Optional<Product> getProductById(int id) {
	 return productRepository.findById(id);
 }
}
