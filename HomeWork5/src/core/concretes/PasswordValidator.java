package core.concretes;

import core.abstracts.ValidatorService;
import entities.concretes.User;

public class PasswordValidator implements ValidatorService{

	@Override
	public boolean checkUser(User user) {
		if(user.getPassword().length()>=6) {
			System.out.println("Valid password");
			return true;
		}
		else {
			System.out.println("Invalid password");
			return false;
		}
	}

}

