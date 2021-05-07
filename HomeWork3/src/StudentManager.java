
public class StudentManager extends UserManager{

	@Override
	public void addUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullan�c� ba�ar�yla eklendi.");
	}

	@Override
	public void deleteUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullan�c� ba�ar�yla silindi.");
	}

	@Override
	public void updateUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullan�c� ba�ar�yla g�ncellendi.");
	}

	@Override
	public void showUsers(User[] users) {
		System.out.println("            ��renci Listesi           ");
		for (User user : users) {
			System.out.println("Kullan�c� Id: " + user.getId());
			System.out.println("Kullan�c� Email: " + user.getEmail());
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
				+ " ��rencisinin Ald��� Dersler        ");
		for (String course : student.getCourseTaken()) {
			System.out.println("- " + course);
		}
	}
}
