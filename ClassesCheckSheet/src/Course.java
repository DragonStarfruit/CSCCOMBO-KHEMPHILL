
public class Course {
	
	private String courseNumber;
	private int numsStudents;
	private int maxStudents;
	private int credits;
	
	//constructors 
	public Course() {

	}

	public Course(String courseNumber, int numsStudents, int maxStudents, int credits) {
		super();
		this.courseNumber = courseNumber;
		this.numsStudents = numsStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}

	// getters and setters 
	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getNumsStudents() {
		return numsStudents;
	}

	public void setNumsStudents(int numsStudents) {
		this.numsStudents = numsStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	// dbString 
	public String dbString() {
		return "Course" + courseNumber + "," + numsStudents + "," + maxStudents + "," + credits;
	}
	
	//to String 
	@Override
	public String toString() {
		return "Course courseNumber:" + courseNumber 
				+ "\nNumsStudents:" + numsStudents 
				+ "\nMaxStudents:" + maxStudents
				+ "\nCredits:" + credits;
	} 

}
