
public class FullRemoteCourse extends OnlineCourse{
	
	private String email; 
	
	public FullRemoteCourse() {
		
	}
	
	public FullRemoteCourse(String courseNumber, int numsStudents, int maxSudents, int credits, String email) {
		super(courseNumber, numsStudents, maxSudents, credits);
		this.email = email; 

	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Course courseNumber:" + getCourseNumber() 
		+ "\nNumsStudents:" + getNumsStudents() 
		+ "\nMaxStudents:" + getMaxSudents()
		+ "\nCredits:" + getCredits() 
		+ "\nEmail: " + email;
	}

	
}
