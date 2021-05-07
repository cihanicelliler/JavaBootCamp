
public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setInstructorId(1);
		instructor1.setEmail("insturtor1@example.com");
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		String[] courseAdded = { "Programlamaya Giriş için Temel Kurs", "Java+React", "C#+Angular" };
		instructor1.setCourseAdded(courseAdded);

		Student student1 = new Student();
		student1.setId(2);
		student1.setStudentId(1);
		student1.setEmail("student1@example.com");
		student1.setFirstName("Cihan");
		student1.setLastName("İçelliler");
		String[] courseTaken = { "Programlamaya Giriş İçin Temel Kurs", "Java+React" };
		student1.setCourseTaken(courseTaken);

		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		user1 = instructor1;
		user2 = student1;
		user3.setId(3);

		System.out.println(user1.email);
		System.out.println(user2.email);

		StudentManager studentManager = new StudentManager();
		Student[] students = { student1 };
		studentManager.showUsers(students);
		studentManager.showCourse(student1);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addLesson("Python");

		instructorManager.showLessons(instructor1);
		User[] users = { instructor1 };
		instructorManager.showUsers(users);

	}

}
