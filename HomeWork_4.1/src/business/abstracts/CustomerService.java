package business.abstracts;

import entities.concretes.Customer;

public interface CustomerService {
	
	void Save(Customer customer) throws Exception;
	
}
