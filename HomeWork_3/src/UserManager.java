
public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullanýcý baþarýyla eklendi.");
	}

	public void deleteUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullanýcý baþarýyla silindi.");
	}

	public void updateUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullanýcý baþarýyla güncellendi.");
	}

	public void showUsers(User[] users) {
		System.out.println("            Kullanýcý Listesi         ");
		for (User user : users) {
			System.out.println("Kullanýcý Id: " + user.getId());
			System.out.println("Kullanýcý Email: " + user.getEmail());
			System.out.println("-----------------");
		}
	}
}
