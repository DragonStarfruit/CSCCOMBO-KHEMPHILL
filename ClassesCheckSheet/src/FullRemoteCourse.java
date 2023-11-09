
public class FullRemoteCourse extends OnlineCourse{
	
	private String email; 
	
	public FullRemoteCourse() {
		
	}
	
	public FullRemoteCourse(String courseNumber, int numsStudents, int maxSudents, int credits, String email) {
		super(courseNumber, numsStudents, maxSudents, credits);
		this.email = email; 

	}

	@Override
	public String toString() {
		return "Email: " + email;
	}

	
}
