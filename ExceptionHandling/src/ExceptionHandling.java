
public class ExceptionHandling {

	public static void main(String[] args) {
		
//		int[] nums = {1,2,3};
		int[] nums; 
		
		try {
//			int myNums = Integer.parseInt("s45");
			nums = new int[] {1,2,3};
//			System.out.println(nums[3]);
			setIndexTen(nums);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			nums = new int[] {1,2,3,4};
			System.out.println(nums[3]);
			System.out.println("oops you went out of your array");
			e.printStackTrace();
			System.out.println(e.getMessage());
			nums = new int[12];
			setIndexTen(nums);
		}
		catch (NumberFormatException e) {
			System.out.println("those are letters not numbers");
		}
		finally {
			System.out.println("carry on!");
		}
		System.out.println("outside of the exceptions");
		
	}
	
	public static void setIndexTen(int[] arr) {
		if(arr.length < 11) {
			throw new ArrayIndexOutOfBoundsException("that array isn't big enough for 10 locations"); 
		}
		arr[10] = 5; 
	}

}
