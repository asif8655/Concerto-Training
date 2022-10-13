package com.boot.demo.SpringBootDemo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.boot.demo.SpringBootDemo.entity.Product;
import com.boot.demo.SpringBootDemo.service.ProductService;

//@Controller
//@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	//@RequestMapping("/")
	//@GetMapping
	public String getProducts(Map<String, List<Product>> map)
	{
		System.out.println("get products");
		List<Product> products = this.service.getAllProducts();
		System.out.println("products "+products);
		map.put("products", products);
		return "productslist";
	}
	//@RequestMapping(method = RequestMethod.POST, path="/add")
	public String addProduct(Product product)
	{
		System.out.println("add product");
		this.service.saveOrUpdate(product);
		return "redirect:/products";
	}
//	//@GetMapping("/purchase")
//	public String purchaseProducts(Model map, HttpSession session, RedirectAttributes attr)
//	{
//		System.out.println("purchase products");
//		if(session.getAttribute("email") == null)
//		{
//			
//			attr.addFlashAttribute("message", "Please login to purchase");
//			attr.addFlashAttribute("purchase", true);
//			return "redirect:/";
//		}
//		List<Product> products = this.service.list();
//		System.out.println("products "+products);
//		map.addAttribute("products", products);
//		return "purchase";
//	}
}
