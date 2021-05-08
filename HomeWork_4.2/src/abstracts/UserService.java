package abstracts;

import entities.User;

public interface UserService {
	void Add(User user) throws Exception;
	void Update(User user) throws Exception;
	void Delete(User user) throws Exception;
}
