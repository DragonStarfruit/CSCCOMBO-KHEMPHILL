
public class Driver {

	public static void main(String[] args) {
		int[][] manArr = {
				{0,1,2,3},
				{4,5,6},
				{7,8,9,10}
		};
		
		//2D Arrays//
		char [][] arr = new char[3][4];
//		int count = 0;
		char letter = 'a';
		for (int rows = 0; rows <arr.length; rows++) {
			for (int column = 0; column<arr[rows].length; column++) {
				arr[rows][column] = letter;
				letter++;
			}
		}
		//print 2D Array//
		for (int rows = 0; rows <arr.length; rows++) {
			for (int column = 0; column<arr[rows].length; column++) {
				System.out.print(arr[rows][column] + " ");
			}
			System.out.println();
		}
	}

}
