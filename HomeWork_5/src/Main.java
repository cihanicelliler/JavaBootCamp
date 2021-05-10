import Auth.AuthManager;
import Auth.AuthService;
import business.abstracts.UserService;
import business.concretes.UserManager;
import core.abstracts.UserVerifyService;
import core.abstracts.ValidatorService;
import core.concretes.MailValidator;
import core.concretes.NameValidator;
import core.concretes.PasswordValidator;
import core.concretes.RepeatMailValidator;
import core.concretes.UserVerifyCode;
import dataAccess.concretes.DbUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		ValidatorService [] validatorService = {new MailValidator(), new PasswordValidator(), new NameValidator(), new RepeatMailValidator()};

		UserVerifyService userVerifyService = new UserVerifyCode();
		AuthService googleAuthService= new AuthManager();
		
		User user1= new User(1,"icellilercihan@gmail.com","@123abc123","Cihan","Ýçelliler");
		UserService userService = new UserManager(validatorService,new DbUserDao(), userVerifyService,googleAuthService);
		userService.register(user1);
		userService.login(user1);
		
		userService.googLeRegister(user1);
		User user2= new User(2,"tdarslan@gmail.com","@123456@","Taylan Deniz","Arslan");
		userService.register(user2);
		userService.googLeRegister(user2);
		
		
		User user3 = new User(3,"cnbrk@gmail.com","@abccba@","Canberk","Yalçýn");
		userService.register(user3);
		userService.login(user3);
	}

}
