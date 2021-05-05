
public class InstructorManager extends UserManager {
	@Override
	public void addUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullanıcı başarıyla eklendi.");
	}

	@Override
	public void deleteUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullanıcı başarıyla silindi.");
	}

	@Override
	public void updateUser(User user) {
		System.out.println(user.getEmail() + "mail adresli kullanıcı başarıyla güncellendi.");
	}

	@Override
	public void showUsers(User[] users) {
		System.out.println("             Kullanıcı Listesi           ");
		for (User user : users) {
			System.out.println("Kullanıcı Id: " + user.getId());
			System.out.println("Kullanıcı Email: " + user.getEmail());
			System.out.println("-----------------");
		}
	}

	public void addLesson(String lessonName) {
		System.out.println(lessonName + " isimli kurs basariyla eklendi.");
	}

	public void updateLesson(String lessonName) {
		System.out.println(lessonName + " isimli kurs basariyla güncellendi.");
	}

	public void deleteLesson(String lessonName) {
		System.out.println(lessonName + " isimli kurs basariyla silindi.");
	}

	public void showLessons(Instructor instructor) {
		System.out.println("            " + instructor.getFirstName() + " " + instructor.getLastName()
				+ " Eğitmenin Verdiği Dersler          ");
		for (String lesson : instructor.getCourseAdded()) {
			System.out.println("- " + lesson);
		}
	}
}
