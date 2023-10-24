
public class fromToArray {

	public static void main(String[] args) {
		fromToArray(5, 10);
	}

	public static int[] fromToArray(int start, int end) {
		int[] nums = new int[(end - start)];
		for (int i = start; i < nums.length; i++) {
			nums[i] = i;
		}
		return nums;
	}

}
