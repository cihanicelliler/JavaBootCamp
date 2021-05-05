
public class Instructor extends User {
	private int instructorId;
	private String firstName;
	private String lastName;
	private String[] courseAdded;

	public Instructor() {

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getCourseAdded() {
		return courseAdded;
	}

	public void setCourseAdded(String[] courseAdded) {
		this.courseAdded = courseAdded;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

}
