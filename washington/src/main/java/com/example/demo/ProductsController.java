package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    
@RequestMapping(path="/demo")
public class ProductsController {

	@Autowired 
private ProductsRepository productsRepository;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllProducts() {
		// This returns a JSON or XML with the users
		return productsRepository.findAll();
	}
}


