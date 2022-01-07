package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Order;
import net.javaguides.springboot.model.UserDetail;

@Service
public interface FoodService {
	
	public void signUpUser(UserDetail userDetail);
	
	public boolean loginValidation(UserDetail userDetail);
	public String placeOrder(Order order);
	public List<Order> getAllOrders();

}
