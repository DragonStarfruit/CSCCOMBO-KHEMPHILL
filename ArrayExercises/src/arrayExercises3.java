import java.util.Arrays;

public class arrayExercises3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FindCommon

		int commonCount = 0;
		int nums1[] = { 1, 2, 3, 4, 5, 6 };
		int nums2[] = { 1, 7, 8, 9, 10, 11 };
		int commonNums[] = new int[nums1.length];
		commonNums = findCommon(nums1, nums2);
		System.out.println(Arrays.toString(commonNums));
	}

	public static int[] findCommon(int[] nums1, int[] nums2) {
		int[] common = new int[nums1.length];
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums2[j] == nums1[i]) {
					common[count] = nums1[i];
					count++;

				}
			}
		}
		return common;
	}
}
