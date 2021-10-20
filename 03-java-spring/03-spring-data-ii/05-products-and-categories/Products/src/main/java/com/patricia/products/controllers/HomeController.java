package com.patricia.products.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.patricia.products.Models.Category;
import com.patricia.products.Models.Product;
import com.patricia.products.services.CategoryService;
import com.patricia.products.services.ProductService;

@Controller
public class HomeController {
	private final ProductService pService;
	private final CategoryService cService;
	
	public HomeController(ProductService pService, CategoryService cService) {
		this.cService = cService;
		this.pService = pService;
	}
	
	@GetMapping("/")
		public String Index(@ModelAttribute("Product")Product product, Model model) {
			List<Product> products = pService.allProducts();
			model.addAttribute("products", products);
			return "index.jsp";
	}
	
	@PostMapping("/createProduct")
		public String createProduct(@Valid @ModelAttribute("Product")Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/";
		}
		pService.createProduct(product);
			return "redirect:/";
	}
	
	@GetMapping("/addCategory")
		public String addCategory(@ModelAttribute("Category") Category category,Model model) {
			List<Category> categories  =cService.allCats();
			model.addAttribute("categories", categories);
			return "categories.jsp";
	}
	
	@PostMapping("/createCategory")
		public String createCategory(@Valid @ModelAttribute("Category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/addCategory";
		}
		cService.createCat(category);
			return "redirect:/addCategory";
	}
	
	@GetMapping("/showprod/{prodid}")
		public String showProduct(@ModelAttribute("products") Product p,@PathVariable("prodid") Long id, Model model) {
			model.addAttribute("product", this.pService.getProduct(id));
			List <Category> cat = this.cService.CatNotContains(p);
			model.addAttribute("cat", cat);
			
		
			
			
			return "showprod.jsp";
	}
}
