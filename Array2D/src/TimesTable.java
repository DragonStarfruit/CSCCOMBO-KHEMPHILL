import java.util.Arrays;

public class TimesTable {
	private int[][] timesTable;;

	//constructors
	public TimesTable() {
		timesTable = new int[10][10]; 
		for (int rows = 0; rows <timesTable.length; rows++) {
			for (int column = 0; column<timesTable[rows].length; column++) {
				timesTable[rows][column] = (rows + 1)*(column + 1);
			}
		}
	}
	
	//methods
	public static int[][] createTimesTable(int rows, int cols) { 
		int[][] timesTable = new int[rows][cols];
		for ( rows = 0; rows <timesTable.length; rows++) {
			for (cols = 0; cols<timesTable[rows].length; cols++) {
				timesTable[rows][cols] = (rows + 1)*(cols + 1);
			}
		}
		return timesTable;
	}
	
	public static String printTimesTable(TimesTable[][] timesTable) {
		String table = "";
		for (int rows = 0; rows <timesTable.length; rows++) {
			for (int column = 0; column<timesTable[rows].length; column++) {
				table += "" + (rows + 1)*(column + 1) + "" ;
			}
			table += "\n";
		}
		return table;
		
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
