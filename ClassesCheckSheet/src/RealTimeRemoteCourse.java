
public class RealTimeRemoteCourse extends OnlineCourse{

	private String zoom; 
	
	public RealTimeRemoteCourse() {
		
	}

	public RealTimeRemoteCourse(String courseNumber, int numsStudents, int maxSudents, int credits, String zoom) {
		super(courseNumber, numsStudents, maxSudents, credits);
		this.zoom = zoom; 
	}

	@Override
	public String toString() {
		return  "Zoom: " + zoom ;
	}
	
	

}
