package business.concretes;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	
	CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService; 
	}
	@Override
	public void Save(Customer customer) throws Exception {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			throw new Exception("Not a valid Person");
		}
		
	}
	
	
}
