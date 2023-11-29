
public class InPersonCourse extends Course{

	private String roomNumber;
	
	public InPersonCourse() {
		
	}
	
	public InPersonCourse(String courseNumber, int numsStudents, int maxSudents, int credits, String roomNumber) {
		super(courseNumber, numsStudents, maxSudents, credits);
		this.roomNumber = roomNumber; 
	}
	
	

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	// dbString 
	public String dbString() {
		return "InPersonCourse" + "," + getCourseNumber() + "," + getNumsStudents() + "," + getMaxStudents() + "," + getCredits() + "," + roomNumber;
	}
	
	@Override
	public String toString() {
		return "Course courseNumber:" + getCourseNumber() 
		+ "\nNumsStudents:" + getNumsStudents() 
		+ "\nMaxStudents:" + getMaxStudents()
		+ "\nCredits:" + getCredits() 
		+ "\nRoom Number: " + roomNumber;
	}	
	
	
}
