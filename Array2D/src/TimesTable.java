import java.util.Arrays;

public class TimesTable {
	private int[][] timesTable;;

	//constructors
	public TimesTable(int[][] timesTable) {
		super();
		this.timesTable = timesTable;
		timesTable = new int[10][10];
		int count = 0; 
		for (int rows = 0; rows <timesTable.length; rows++) {
			for (int column = 0; column<timesTable[rows].length; column++) {
				timesTable[rows][column] = count;
				count++;
			}
		}
	}
	
	//methods
	public int createTimesTable(int rows, int cols) { 
		for(int row = 0; row<rows; row++) {
			for(int col = 0; col<cols; col++) {
				
			}
		}
		return 0;
		
	}
	
	// toString
	@Override
	public String toString() {
		String table = ""; 
		for (int rows = 0; rows<timesTable.length; rows++) {
			for (int col = 0; col<timesTable[rows].length; col++) {
				table += String.format("%4d", timesTable[rows][col]) + " ";
			}
			table += "\n";
		}
		return table;
	}
	 
	
}	
