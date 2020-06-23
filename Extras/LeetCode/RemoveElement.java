package LeetCode;

import java.util.Arrays;

public class RemoveElement {
	public static void main(String args[]) {
		int[] nums = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(nums,2));
		System.out.println(Arrays.toString(nums));
		
	}
    public static int removeElement(int[] nums, int val) {
        int i = 0,j = 0;
        while(j<nums.length){
            if(nums[j] != val){
                nums[i++] = nums[j++];
            }
            else{
                j++;
            }
        }
        return i;
    }
}
