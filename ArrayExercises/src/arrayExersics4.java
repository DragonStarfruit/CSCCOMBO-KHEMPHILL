
public class arrayExersics4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FindEvenOdd
		int nums[] = {1,2,3,4,5,6,7};
		System.out.println("There are " + EvenOdd(nums)+ " even numbers " );
		System.out.println("There are " + (nums.length-EvenOdd(nums)) + " odd numbers " );
	}
	public static int EvenOdd(int[] nums) {
		int evens = 0; 
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2 == 0) {
				evens++;
			}
		}
		return evens;
	}
}
