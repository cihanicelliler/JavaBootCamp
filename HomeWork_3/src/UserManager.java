
public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullan�c� ba�ar�yla eklendi.");
	}

	public void deleteUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullan�c� ba�ar�yla silindi.");
	}

	public void updateUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullan�c� ba�ar�yla g�ncellendi.");
	}

	public void showUsers(User[] users) {
		System.out.println("            Kullan�c� Listesi         ");
		for (User user : users) {
			System.out.println("Kullan�c� Id: " + user.getId());
			System.out.println("Kullan�c� Email: " + user.getEmail());
			System.out.println("-----------------");
		}
	}
}
