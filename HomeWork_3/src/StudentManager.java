
public class StudentManager extends UserManager{

	@Override
	public void addUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullanýcý baþarýyla eklendi.");
	}

	@Override
	public void deleteUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullanýcý baþarýyla silindi.");
	}

	@Override
	public void updateUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullanýcý baþarýyla güncellendi.");
	}

	@Override
	public void showUsers(User[] users) {
		System.out.println("            Öðrenci Listesi           ");
		for (User user : users) {
			System.out.println("Kullanýcý Id: " + user.getId());
			System.out.println("Kullanýcý Email: " + user.getEmail());
			System.out.println("-----------------");
		}
	}

	public void addCourse(String courseName) {
		System.out.println(courseName + " isimli kurs basariyla eklendi.");
	}

	public void deleteCourse(String courseName) {
		System.out.println(courseName + " isimli kurs basariyla silindi.");
	}

	public void showCourse(Student student) {
		System.out.println("          " + student.getFirstName() + " " + student.getLastName()
				+ " Öðrencisinin Aldýðý Dersler        ");
		for (String course : student.getCourseTaken()) {
			System.out.println("- " + course);
		}
	}
}
