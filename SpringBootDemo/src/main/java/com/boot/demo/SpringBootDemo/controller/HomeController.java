package com.boot.demo.SpringBootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.boot.demo.SpringBootDemo.service.CustomerService;


//@Controller
public class HomeController {
	
	@Autowired
	private CustomerService service;

	public HomeController() {
		System.out.println("home controller def const");
	}
	//@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	//@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	//@RequestMapping("/add")
	public String addProduct()
	{
		return "addproduct";
	}
	//@RequestMapping("/logout")
//	public ModelAndView logout(HttpSession session)
//	{
//		ModelAndView mv = new ModelAndView();
//		session.removeAttribute("email");
//		System.out.println("logout");
//		mv.addObject("email",null);
//		mv.setViewName("redirect:/");
//		return mv;
//	}
//	@RequestMapping(path =  "/login", method = RequestMethod.POST)
//	public String login(@RequestParam String email, @RequestParam String password, 
//			HttpSession session, @RequestParam(defaultValue = "false") boolean purchase)
//	{
//		System.out.println("Login "+email);
//		System.out.println("purchase "+(purchase));
//		if(this.service.login(email, password)) {
//			session.setAttribute("email", email);
//			if(purchase)
//				return "redirect:/products/purchase";
//			return "redirect:/customers/"+email;
//		}
//		System.out.println("false");
//		return "redirect:/";
//	}
}
