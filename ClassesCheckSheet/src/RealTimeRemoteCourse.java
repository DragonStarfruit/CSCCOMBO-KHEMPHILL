
public class RealTimeRemoteCourse extends OnlineCourse{

	private String zoom; 
	
	public RealTimeRemoteCourse() {
		
	}

	public RealTimeRemoteCourse(String courseNumber, int numsStudents, int maxSudents, int credits, String zoom) {
		super(courseNumber, numsStudents, maxSudents, credits);
		this.zoom = zoom; 
	}

	
	
	public String getZoom() {
		return zoom;
	}

	public void setZoom(String zoom) {
		this.zoom = zoom;
	}

	// dbString 
	public String dbString() {
		return getCourseNumber() + "," + getNumsStudents() + "," + getMaxStudents() + "," + getCredits() + "," + zoom;
	} 
		
	@Override
	public String toString() { 
		return  "Course courseNumber:" + getCourseNumber() 
				+ "\nNumsStudents:" + getNumsStudents() 
				+ "\nMaxStudents:" + getMaxStudents()
				+ "\nCredits:" + getCredits() 
				+ "\nZoom: " + zoom ;
	}
	
	

}
