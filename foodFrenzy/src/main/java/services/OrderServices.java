package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entities.Orders;
import entities.User;
import repositories.OrderRepository;

@Component
public class OrderServices {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Orders> getOrders(){
		List<Orders> list = this.orderRepository.findAll();
		return list;
	}
	
	public void saveOrder(Orders order) {
		this.orderRepository.save(order);
	}
	
	public void updateOrder(int id, Orders order) {
		order.setoId(id);
		this.orderRepository.save(order);
	}
	
	public void deleteOrder(int id) {
		this.orderRepository.deleteById(id);
	}
	
	public List<Orders> getOrdersForUser(User user){
		return this.orderRepository.findOrdersByUser(user);
	}
}
