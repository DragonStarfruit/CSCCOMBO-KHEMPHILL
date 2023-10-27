
public class Course {
	
	private String courseNumber;
	private int numsStudents;
	private int maxSudents;
	private int credits;
	
	//constructors 
	public Course(String courseNumber) {
		super();
		this.courseNumber = courseNumber;
	}

	public Course(String courseNumber, int numsStudents, int maxSudents, int credits) {
		super();
		this.courseNumber = courseNumber;
		this.numsStudents = numsStudents;
		this.maxSudents = maxSudents;
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

	public int getMaxSudents() {
		return maxSudents;
	}

	public void setMaxSudents(int maxSudents) {
		this.maxSudents = maxSudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	//to String 
	@Override
	public String toString() {
		return "Course courseNumber:" + courseNumber 
				+ "\n numsStudents:" + numsStudents 
				+ "\n maxSudents:" + maxSudents
				+ "\n credits:" + credits;
	} 

}
