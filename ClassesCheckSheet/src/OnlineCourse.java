
public class OnlineCourse extends Course{

	public OnlineCourse() {
		super(); 
	}
	
	public OnlineCourse(String courseNumber, int numsStudents, int maxSudents, int credits) {
		super(courseNumber, numsStudents, maxSudents, credits);
	}

	@Override
	public String toString() {
		return "OnlineCourse []";
	}

	
	
}
