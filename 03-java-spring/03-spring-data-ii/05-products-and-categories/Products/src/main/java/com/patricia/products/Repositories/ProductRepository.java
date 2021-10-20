package com.patricia.products.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patricia.products.Models.Category;
import com.patricia.products.Models.Product;

@Repository

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
	List<Product> findAllByCategories(Category category );
	List<Product> findByCategoriesNotContains(Category category);
}
