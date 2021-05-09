package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.ValidatorService;
import entities.concretes.User;

public class MailValidator implements ValidatorService{

	String mailPattern = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	Pattern pattern = Pattern.compile(mailPattern,Pattern.CASE_INSENSITIVE);
	@Override
	public boolean checkUser(User user) {
		Matcher matcher = pattern.matcher(user.getEmail());
		if(matcher.matches()) {
			System.out.println("Mail pattern is success.");
			return true;
		}
		else {
			System.out.println("Invalid mail.");
			return false;
		}
		
	}
	
	
}
