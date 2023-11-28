
public class OnlineCourse extends Course{

	public OnlineCourse() {
		super(); 
	}
	
	public OnlineCourse(String courseNumber, int numsStudents, int maxStudents, int credits) {
		super(courseNumber, numsStudents, maxStudents, credits);
	}

	@Override
	public String toString() {
		return "OnlineCourse []";
	}

	
	
}
