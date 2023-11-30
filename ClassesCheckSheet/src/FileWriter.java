import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {
	private String dbFile = "CourseDatabase.csv";
	
	PrintWriter printer; 
	
	public FileWriter() throws FileNotFoundException {
		File courseFile = new File(dbFile); 
		printer = new PrintWriter(courseFile);
		
	}
	
	public static File createFile(String name) throws IOException{
		File myFile = new File(name);
		if (!myFile.exists()) {
			if (myFile.createNewFile()) {
			System.out.println("File created successfully");	
			}
			
		}
		else {
			System.out.println("File already exists in directory");
		}
		return myFile;
	}
	
	public void writeToFile(Course course) {
		printer.println(course.dbString());
	}
	
	public void close() {
		printer.close();
	}
}
