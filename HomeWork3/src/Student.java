
public class Student extends User{
	private int studentId;
	private String firstName;
	private String lastName;
	private String[] courseTaken;
	
	public 	Student() {
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String[] getCourseTaken() {
		return courseTaken;
	}
	public void setCourseTaken(String[] courseTaken) {
		this.courseTaken= courseTaken;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studenId) {
		this.studentId = studenId;
	}
}
