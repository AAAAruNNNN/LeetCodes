package Array;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String args[]) {
		System.out.println(Arrays.toString(moveZeroes(new int[] {1,0,2,0,4,12,0})));
	}
	
    public static int[] moveZeroes(int[] nums) 
    {
//        int temp;
//        for(int i = 0; i < nums.length ; i++)
//        {
//            if(nums[i] == 0)
//            {
//                for(int j = i+1 ; j < nums.length ; j++) {
//                    if(nums[j] != 0){
//                        temp = nums[i];
//                        nums[i] = nums[j];
//                        nums[j] = temp;
//                        break;
//                    }
//                }
//            }
//        }
    	
    	//better solution:
    	for(int lastNonZeroElementsPos = 0, i = 0; i < nums.length; i++ )
    	{
    		int temp;
    		if(nums[i] != 0)
    		{
    			temp = nums[lastNonZeroElementsPos];
    			nums[lastNonZeroElementsPos] = nums[i];
    			nums[i] = temp;
    			lastNonZeroElementsPos++;
    		}
    	}
        return nums;
    }
	
}
