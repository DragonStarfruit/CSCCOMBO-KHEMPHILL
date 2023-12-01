import java.util.ArrayList;

public class TestSchoolRecords {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>(); 
		
		Student student1 = new Student("max", "4000", 1, "abc@gmail.com", "Freshman" );
		
		Student student2 = new Student("zach", "5000", 2, "def@gmail.com", "Sophmore");
		
		Faculty faculty1 = new Faculty("manda", "6000", 3, "ghi@gmail.com", "office1", 10000, "May 9", "9-12am", "Junior");
		
		Faculty faculty2 = new Faculty("jim", "7000", 4, "jkl@gmail.com", "office2", 15000, "May 12", "8-10am", "senior");
		
		Staff staff1 = new Staff("chan", "8000", 5, "mno@gmail.com","office2", 12000, "may 1", "title 1");
		
		Staff staff2 = new Staff("lin", "9000", 6, "qrs@gmail.com","office2", 17000, "may 2", "title 2");
		
		people.add(student1);
		people.add(student2);
		people.add(faculty1);
		people.add(faculty2);
		people.add(staff1);
		people.add(staff2);
		
		for (int i = 0; i<people.size(); i++) {
			printPerson(people.get(i));
		}
	}
	
	public static void printPerson(Object object) {
		System.out.println(object.toString());
	}

}
