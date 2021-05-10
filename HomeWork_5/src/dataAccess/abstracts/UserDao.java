package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
	void Add(User user);
	void Delete(User user);
	void Update(User user);
	void Login(String mail,String password);
}
