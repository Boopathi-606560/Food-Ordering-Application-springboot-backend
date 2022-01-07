package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Order;
import net.javaguides.springboot.model.UserDetail;
import net.javaguides.springboot.service.FoodService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	// create user rest api
	@PostMapping("/createUser")
	public void createUser(@RequestBody UserDetail userDetail) {
		
		foodService.signUpUser(userDetail);
		 
	}
	
	// Login validation  rest api
		@PostMapping("/login")
		public boolean loginValidation(@RequestBody UserDetail userDetail) {
			 boolean isValidUser = foodService.loginValidation(userDetail);
			 return isValidUser;
		}
		
		@PostMapping("/placeOrder")
		public List<Order> placeOrder(@RequestBody Order order) {
			foodService.placeOrder(order);
			System.out.println("orderr"+ order);
			return foodService.getAllOrders();
			
		}
	

	
	

}
