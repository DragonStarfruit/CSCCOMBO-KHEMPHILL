
public class InPersonCourse extends Course{

	private String roomNumber;

	public InPersonCourse(String courseNumber, int numsStudents, int maxSudents, int credits, String roomNumber) {
		super(courseNumber, numsStudents, maxSudents, credits);
		this.roomNumber = roomNumber; 
	}	
}
