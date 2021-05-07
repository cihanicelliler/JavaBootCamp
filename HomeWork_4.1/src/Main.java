import java.time.LocalDate;

import adapters.MernisServiceAdapter;
import business.concretes.BaseCustomerManager;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1,"CÝHAN","ÝÇELLÝLER",LocalDate.of(2001,10,27),"1111111");
		customerManager.Save(customer); 
	}

}
