package business.abstracts;

import entities.concretes.User;

public interface UserService {
	public void register(User user);
	public void login(User user);
	public void googleLogin(User user);
	public void googLeRegister(User user);
}
