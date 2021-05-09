package core.concretes;

import java.util.ArrayList;

import core.abstracts.ValidatorService;
import entities.concretes.User;

public class RepeatMailValidator implements ValidatorService{

	private ArrayList<String> mails = new ArrayList<String>();
	@Override
	public boolean checkUser(User user) {
		if(mails.isEmpty()) {
			System.out.println("Mail is valid");
			mails.add(user.getEmail());
			return true;
		}
		for(String mail : mails) {
			if(mail==user.getEmail()) {
				System.out.println("Mail already exists in the system");
				return false;
			}
			else {
				System.out.println("Mail is valid");
				mails.add(user.getEmail());
				return true;
			}
		}
		return false;
	}

}


