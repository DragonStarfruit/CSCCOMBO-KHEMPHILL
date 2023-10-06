
public class arraysExersice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array Average 
		int nums[] = {1,2,3,4,5,6,7};
		System.out.println(arrayAverage(nums));
	}
	
	public static int arrayAverage(int[] nums) {
		int big = 0,small = 0,total = 0;
		for ( int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			for ( int j = 0; j < nums[j] -1 ; j++) {
				if (nums[j]>nums[i]) {
					big = nums[j];
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			for ( int j = 0; j < nums[j]-1; j++) {
				if (nums[j]<nums[i]) {
					small = nums[j];
				}
			}
		}
		total = ((total - big - small)/nums.length);
		return total;
	}
}
