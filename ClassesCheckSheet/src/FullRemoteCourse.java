
public class FullRemoteCourse extends OnlineCourse{
	
	private String email; 
	
	public FullRemoteCourse() {
		
	}
	
	public FullRemoteCourse(String courseNumber, int numsStudents, int maxStudents, int credits, String email) {
		super(courseNumber, numsStudents, maxStudents, credits);
		this.email = email; 

	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// dbString 
		public String dbString() {
			return getCourseNumber() + "," + getNumsStudents() + "," + getMaxStudents() + "," + getCredits() + "," + email;
		} 

	@Override
	public String toString() {
		return "Course courseNumber:" + getCourseNumber() 
		+ "\nNumsStudents:" + getNumsStudents() 
		+ "\nMaxStudents:" + getMaxStudents()
		+ "\nCredits:" + getCredits() 
		+ "\nEmail: " + email;
	}

	
}
