import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File myFile = createFile("test.txt");
		File myFile2 = createFile("test2.txt");
		
		if (!myFile.exists()) {
			if (myFile.createNewFile()) {
			System.out.println("File created successfully");	
			}
			
		}
		else {
			System.out.println("File already exists in directory");
		}
		
		PrintWriter printer = new PrintWriter(new FileOutputStream(myFile));
		
		printer.println("The moon is full tonight");
		printer.println("This is great");
		printer.flush();
		printer.close();
		
		PrintWriter printer1 = new PrintWriter(new FileOutputStream(myFile2));
		printer1.println("After the flush");
		printer1.close();
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
}
