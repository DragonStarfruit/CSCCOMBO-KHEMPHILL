
public class CSclasses {

	public static void main(String[] args) {
		
		Course courseList1 = new Course("CSC1077");
		Course courseList2 = new Course("CSC1078");
		Course courseList3 = new Course("CSC1079");
		Course courseList4 = new Course("CSC1060", 10, 20, 5);
		Course courseList5 = new Course("CSC1061", 12, 25, 5);
		Course courseList6 = new Course("CSC1062", 9, 20, 5);
		Course[] courseList = {courseList1,courseList2,courseList3,courseList4,courseList5,courseList6};
		
		for (int i = 0; i<courseList.length; i++) {
			System.out.println(courseList[i]);
		}
	}

}
