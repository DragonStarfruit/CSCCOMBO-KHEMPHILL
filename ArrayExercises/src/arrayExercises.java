/************************
 * Array and Methods 	*
 ***********************/
public class arrayExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find Value
//		int[] nums = { 1, 2, 3, 4, 5, 6 };
//		int num = 7;
//		System.out.println(FindValue(nums, num));
//		
		// ArrayReverse
		int[]vals = {1,2,3,4,5,6};
		ArrayReverse(vals);
		//make for loop to print vals array
		System.out.println();
	}

	public static int ArrayReverse(int[] vals) {
		//swap-er
		for (int i = 0; i < vals.length/2; i++) {
		int tempVals = vals[i];
		vals[i] = vals[vals.length-1-i];
		vals[vals.length-1-i] = tempVals;
		}
		
		return vals;
	}
//
//	public static boolean FindValue(int[] nums, int num) {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < nums.length; i++) {
//			if (num == nums[i]) {
//				return true;
//			}
//		}
//		return false;
//	}
}
