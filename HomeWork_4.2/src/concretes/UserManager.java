package concretes;

import abstracts.UserCheckService;
import abstracts.UserService;

import entities.User;

public class UserManager implements UserService {

	UserCheckService _userCheckService;

	public UserManager(UserCheckService _userCheckService) {
		super();
		this._userCheckService = _userCheckService;
	}

	@Override
	public void Add(User user) throws Exception {
		if (_userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Saved to db : "+user.getFirstName()+" "+user.getLastName());
		}
		else {
			System.out.println("Not a valid person.");
		}

	}

	@Override
	public void Update(User user) throws Exception {
		if (_userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Updated : "+user.getFirstName()+" "+user.getLastName());
		}
		else {
			System.out.println("Not a valid person.");
		}

	}

	@Override
	public void Delete(User user) throws Exception {
		if (_userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Deleted : "+user.getFirstName()+" "+user.getLastName());
		}
		else {
			System.out.println("Not a valid person.");
		}

	}

}
