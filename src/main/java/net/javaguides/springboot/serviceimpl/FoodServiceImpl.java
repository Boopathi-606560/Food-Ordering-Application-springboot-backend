package net.javaguides.springboot.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.javaguides.springboot.model.Order;
import net.javaguides.springboot.model.UserDetail;
import net.javaguides.springboot.repository.OrderRepository;
import net.javaguides.springboot.repository.UserDetailRepository;
import net.javaguides.springboot.service.FoodService;

@Component
public class FoodServiceImpl  implements FoodService{
	
	@Autowired
	private UserDetailRepository  userDetailRepository;

	@Autowired
	private OrderRepository  orderRepository;
	@Override
	public void signUpUser(UserDetail userDetail) {
		// TODO Auto-generated method stub
		
		userDetailRepository.save(userDetail);
		
	}

	@Override
	public boolean loginValidation(UserDetail userDetail) {
		// TODO Auto-generated method stub
		Optional<UserDetail> existUser;
		 existUser = userDetailRepository.findById(userDetail.getEmailId());
		 System.out.println("existingggggggggggg..." + existUser );
		 if(existUser.isEmpty()) {
			 return false;
		 } else {
			 return true;
		 }
	}

	@Override
	public String placeOrder(Order order) {
		orderRepository.save(order);
		return "";
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}
