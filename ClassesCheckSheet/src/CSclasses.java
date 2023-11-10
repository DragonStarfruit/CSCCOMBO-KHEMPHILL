import java.util.ArrayList;
import java.util.List;

public class CSclasses {

	public static void main(String[] args) {
		
		List<Course> courseList = new ArrayList<>(); 
		
		Course combo = new InPersonCourse("CSC1060", 20, 30, 5, "bp100");
		courseList.add(combo);
		Course math = new FullRemoteCourse("Calc100", 15, 25, 5, "NameAndSomeNumbersNumbers@gmail.com");
		courseList.add(math);
		Course moreCoding = new RealTimeRemoteCourse("CSC100", 25, 35, 5, "ZoomCode"); 
		courseList.add(moreCoding); 
		
		courseInfo(combo);
//		for(int i = 0; i<courseList.size(); i++) {
//			printCourse(courseList.get(i));
//		}
		
	}
	
	public static void printCourse(Course course) {
		System.out.println(course.toString());
	}
	
	public static void courseInfo(Course course) {
		if(course instanceof InPersonCourse) {
			System.out.println("Course Number: " + course.getCourseNumber());
			System.out.println("Number of Students: " + course.getNumsStudents());
			System.out.println("Max Students" + course.getMaxSudents());
			System.out.println("Credits: " + course.getCredits());
			System.out.println("Room Number: " + ((InPersonCourse)course).getRoomNumber());
		}
		if(course instanceof FullRemoteCourse) {
			System.out.println("Course Number: " + course.getCourseNumber());
			System.out.println("Number of Students: " + course.getNumsStudents());
			System.out.println("Max Students" + course.getMaxSudents());
			System.out.println("Credits: " + course.getCredits());
			System.out.println("Email: " + ((FullRemoteCourse)course).getEmail());
		}
		if(course instanceof RealTimeRemoteCourse) {
			System.out.println("Course Number: " + course.getCourseNumber());
			System.out.println("Number of Students: " + course.getNumsStudents());
			System.out.println("Max Students" + course.getMaxSudents());
			System.out.println("Credits: " + course.getCredits());
			System.out.println("Zoom: " + ((RealTimeRemoteCourse)course).getZoom());
		}
	}

}
