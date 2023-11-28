import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSclasses {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		List<Course> courseList = new ArrayList<>();
		Course course;

//		Course combo = new InPersonCourse("CSC1060", 20, 30, 5, "bp100");
//		courseList.add(combo);
//		Course math = new FullRemoteCourse("Calc100", 15, 25, 5, "NameAndSomeNumbersNumbers@gmail.com");
//		courseList.add(math);
//		Course moreCoding = new RealTimeRemoteCourse("CSC100", 25, 35, 5, "ZoomCode"); 
		System.out.println("What type of class? in person (1), full time remote (2), real time remote (3)");
		int type = input.nextInt();
		System.out.println("whats the course number?");
		String courseNum = input.next();
		System.out.println("whats the number of students?");
		int numStudents = input.nextInt();
		System.out.println("whats the max number of students?");
		int maxNumStudents = input.nextInt();
		System.out.println("whats the credits?");
		int credits = input.nextInt();

		if (type == 1) {
			System.out.println("What is the room number?");
			String roomNum = input.next();
			course = new InPersonCourse(courseNum, numStudents, maxNumStudents, credits, roomNum);
		} else if (type == 2) {
			System.out.println("What is the Zoom info?");
			String zoom = input.next();
			course = new FullRemoteCourse(courseNum, numStudents, maxNumStudents, credits, zoom);
		} else {
			System.out.println("What is the email?");
			String email = input.next();
			course = new RealTimeRemoteCourse(courseNum, numStudents, maxNumStudents, credits, email);
		}

		courseList.add(course);

		for (int i = 0; i < courseList.size(); i++) {
			printCourse(courseList.get(i));
		}
		
		FileWriter fileWriter = new FileWriter();
		for (Course course1: courseList) {
			fileWriter.writeToFile(course1);
		}
		fileWriter.close();

	}

	public static void printCourse(Course course) {
		System.out.println(course.toString());
	}

	public static void courseInfo(Course course) {
		if (course instanceof InPersonCourse) {
			System.out.println("Course Number: " + course.getCourseNumber());
			System.out.println("Number of Students: " + course.getNumsStudents());
			System.out.println("Max Students" + course.getMaxStudents());
			System.out.println("Credits: " + course.getCredits());
			System.out.println("Room Number: " + ((InPersonCourse) course).getRoomNumber());
		}
		if (course instanceof FullRemoteCourse) {
			System.out.println("Course Number: " + course.getCourseNumber());
			System.out.println("Number of Students: " + course.getNumsStudents());
			System.out.println("Max Students" + course.getMaxStudents());
			System.out.println("Credits: " + course.getCredits());
			System.out.println("Email: " + ((FullRemoteCourse) course).getEmail());
		}
		if (course instanceof RealTimeRemoteCourse) {
			System.out.println("Course Number: " + course.getCourseNumber());
			System.out.println("Number of Students: " + course.getNumsStudents());
			System.out.println("Max Students" + course.getMaxStudents());
			System.out.println("Credits: " + course.getCredits());
			System.out.println("Zoom: " + ((RealTimeRemoteCourse) course).getZoom());
		}
	}

}
