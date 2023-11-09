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
		
//		System.out.println(courseInfo(moreCoding));
//		System.out.println(printCourse(combo));
		
		for (Course i : courseList) {
			System.out.println();
		}

	}
	
	public static String printCourse(Course course) {
		return course.toString(); 
	}
	
	public static String courseInfo(Course course) {
		return "Course number: " + course.getCourseNumber()
		+ "\nNumber of Students: " + course.getNumsStudents()
		+ "\nMax students:" + course.getMaxSudents() 
		+ "\nCredits: " + course.getCredits() 
		+ "\n" + printCourse(course);
	}

}
