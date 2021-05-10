package core.concretes;

import core.abstracts.ValidatorService;
import entities.concretes.User;

public class NameValidator implements ValidatorService{

	@Override
	public boolean checkUser(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			System.out.println("Name and Surname Valid");
			return true;
		}
		else {
			System.out.println("Invalid name - surname.");
			return false;
		}
	}

}
