package com.patricia.products.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.patricia.products.Models.Category;
import com.patricia.products.Models.Product;
import com.patricia.products.Repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository prodRepo;
	
	public ProductService(ProductRepository prodRepo) {
		this.prodRepo = prodRepo;
	}
	
	public List<Product> allProducts(){
		return prodRepo.findAll();
	}
	
	public Product createProduct(Product p) {
		return prodRepo.save(p);
	}
	
	public Product getProduct(Long id) {
		return this.prodRepo.findById(id).orElse(null);
	}
	
	public List<Product> findProdByCat(Category category){
		return prodRepo.findAllByCategories(category);
	}
	
	public List<Product> findProdByCatNotContains(Category category){
		return prodRepo.findByCategoriesNotContains(category);
	}
}
