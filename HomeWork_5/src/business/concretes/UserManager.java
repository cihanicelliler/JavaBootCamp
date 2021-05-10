package business.concretes;

import java.util.Scanner;

import Auth.AuthService;
import business.abstracts.UserService;
import core.abstracts.UserVerifyService;
import core.abstracts.ValidatorService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private ValidatorService[] validatorService;
	private UserDao userDao;
	private UserVerifyService userVerifyService;
	private AuthService authService;

	public UserManager(ValidatorService[] validatorService, UserDao userDao, UserVerifyService userVerifyService,
			AuthService authService) {
		super();
		this.validatorService = validatorService;
		this.userDao = userDao;
		this.userVerifyService = userVerifyService;
		this.authService = authService;
	}

	@Override
	public void register(User user) {
		for (ValidatorService validatorService : validatorService) {
			if (!validatorService.checkUser(user)) {
				System.out.println("Register is not success.");
				return;
			}
		}
		if (!userVerifyService.userVerify()) {
			System.out.println("Verification failed.");
			return;
		} else {
			System.out.println("Verification is success.");
			System.out.println("Register is success.");
			userDao.Add(user);
		}

	}

	@Override
	public void login(User user) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your mail.");
		String mail = input.next();
		System.out.println("Please enter your password.");
		String password = input.next();

		if (mail.equals(user.getEmail()) && password.equals(user.getPassword())) {
			userDao.Login(user.getEmail(), user.getPassword());
			System.out.println("Login is success.");
			return;
		} else {
			System.out.println("Login is not success.");
		}

	}

	@Override
	public void googleLogin(User user) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your mail.");
		String mail = input.next();
		System.out.println("Please enter your password.");
		String password = input.next();
		if (mail.equals(user.getEmail()) && password.equals(user.getPassword())) {
			userDao.Login(user.getEmail(), user.getPassword());
			System.out.println("Logged in with google");
			return;
		} else {
			System.out.println("Could not login with google.");
		}
	}

	@Override
	public void googLeRegister(User user) {
		for (ValidatorService validatorService : validatorService) {
			if (!validatorService.checkUser(user)) {
				System.out.println("Registration with google failed.");
			}
		}
		if (authService.checkMail(user.getEmail())) {
			authService.log("Registered with google.");
			System.out.println("");
			userDao.Add(user);
		}

	}

}
