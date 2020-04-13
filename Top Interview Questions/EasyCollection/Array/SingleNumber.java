package Array;

//import java.util.Arrays;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		/*
		 * 
		 * Arrays.sort(nums);
		 * if(nums.length < 2)
		 * 	return nums[0];
		 * for(int i = 0; i < nums.length - 1 ; i++)
		 * {
		 * 	if(nums[i]!=nums[++i])
		 * 		return nums[i-1];
		 * 	if(i == nums.length - 1)
		 * 		return nums[i];
		 * }
		 * return 0;
		 
		 */

		// better solution:
		int a = 0;
		for (int elem : nums) {
			a ^= elem;
		}
		return a;
	}

	public static void main(String args[]) {
		System.out.println(singleNumber(new int[] { 2, 2, 3, 3, 5, 8, 8 }));
	}
}
