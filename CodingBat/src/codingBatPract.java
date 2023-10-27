
public class codingBatPract {

	public static void main(String[] args) {
		int[] nums = {3,1,3,1,3};
		System.out.println(haveThree(nums));
	}
	public static boolean haveThree(int[] nums) {
		 int three = 0; 
		  for (int i = 0; i<nums.length-1; i++){
		    if (nums[i] == 3){
		      if(nums[i+1] == 3){
		        three--;
		      }
		      else{
		        three++;
		      }
		    }
		  }
		  if (nums.length != 1 && nums[nums.length-1] == 3 && nums[nums.length-2] != 3) {
		    	three++;
		    }
		  return (three == 3);
		}
}