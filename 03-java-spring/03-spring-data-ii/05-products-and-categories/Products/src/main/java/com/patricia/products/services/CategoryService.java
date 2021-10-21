package com.patricia.products.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patricia.products.Models.Category;
import com.patricia.products.Models.Product;
import com.patricia.products.Repositories.CategoryRepository;


@Service
public class CategoryService {
private final CategoryRepository catRepo;
	
	public CategoryService(CategoryRepository catRepo) {
		this.catRepo = catRepo;
	}
	
	public List<Category> allCats(){
		return catRepo.findAll();
	}
	
	public Category createCat(Category c) {
		return catRepo.save(c);
	}
	
	public Category getCategory(Long id) {
		return this.catRepo.findById(id).orElse(null);
	}
	
	public List<Category> findCatByProd(Product products){
		return catRepo.findAllByProducts(products);
	}
	
	public List<Category> CatNotContains(Product p){
		return catRepo.findByProductsNotContains(p);
	}
	
	public void addCatToProd(Product product, Category category) {
		List<Product> products = category.getProducts();
		products.add(product);
		this.catRepo.save(category);
	}
		
		
	
}
