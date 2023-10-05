/************************
 * Array and Methods *
 ***********************/
public class arrayExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find Value
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		int num = 6;
		System.out.println(FindValue(nums, num));
	}
	
	public static boolean FindValue(int[] nums, int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < nums.length; i++) {
			if (num == nums[i]) {
				return true;
			}
		}
		return false;
	}
}
