package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class DbUserDao implements UserDao{

	public ArrayList<User> users = new ArrayList<User>();
	@Override
	public void Add(User user) {
		users.add(user);
		System.out.println("Saved to db: "+user.getFirstName()+" "+user.getLastName());
		for (User user1 : users) {
			System.out.println("Users: "+user1.getFirstName()+ " "+user1.getLastName());
			System.out.println("Passwords : @@@@@@@@@");
			
		}
		
	}

	@Override
	public void Delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Login(String mail, String password) {
		System.out.println("Logged into the system.");
		
	}

}
