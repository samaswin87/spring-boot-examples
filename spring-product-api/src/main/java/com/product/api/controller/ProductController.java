package com.product.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.model.Product;

@RestController
public class ProductController {
	private static List<Product> lists = new ArrayList<Product>();
	
	static {
		Product p = new Product(1, "Bread", "Cake");
		lists.add(p);
		p = new Product(2, "Nut", "Food");
		lists.add(p);
		p = new Product(3, "Apple", "Food");
		lists.add(p);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/products")
	@ResponseBody
	public List<Product> products() {
	    return lists;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/product/{id}")
	@ResponseBody
	public Product product(@PathVariable("id") Integer id) {
	    return lists.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
	}
}
