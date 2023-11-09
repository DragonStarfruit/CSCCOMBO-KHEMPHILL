
public class InPersonCourse extends Course{

	private String roomNumber;
	
	public InPersonCourse() {
		
	}
	
	public InPersonCourse(String courseNumber, int numsStudents, int maxSudents, int credits, String roomNumber) {
		super(courseNumber, numsStudents, maxSudents, credits);
		this.roomNumber = roomNumber; 
	}

	@Override
	public String toString() {
		return "Room Number: " + roomNumber;
	}	
	
	
}
