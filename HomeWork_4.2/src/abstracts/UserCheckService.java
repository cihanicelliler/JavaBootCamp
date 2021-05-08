package abstracts;

import java.rmi.RemoteException;

import entities.User;


public interface UserCheckService {
	boolean CheckIfRealPerson(User user) throws RemoteException;
}
