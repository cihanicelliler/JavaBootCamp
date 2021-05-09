package core.abstracts;

import entities.concretes.User;

public interface ValidatorService {
	public boolean checkUser(User user);
}
