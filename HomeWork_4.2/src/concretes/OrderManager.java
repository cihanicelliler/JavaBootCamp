package concretes;

import abstracts.OrderService;
import entities.GameSale;

public class OrderManager implements OrderService{

	@Override
	public void add(GameSale order) {
		System.out.println("Order added");
		
	}

	@Override
	public void update(GameSale order) {
		System.out.println("Order updated");
		
	}

	@Override
	public void delete(GameSale order) {
		System.out.println("Order deleted");
		
	}

}
