package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    int[] housesVisited;
    
    public static void main(String args[]) {
    	HouseRobber obj = new HouseRobber();
    	System.out.println(obj.rob(new int[] {1,2,3,4,5}));
    }
    
    public int rob(int[] nums) {
        housesVisited = new int[nums.length];
        Arrays.fill(housesVisited, -1);
        return rob(nums,0);
    }
    
    public int rob(int[] nums, int i){
        if(i>=nums.length)
            return 0;
        if(housesVisited[i] == -1)
            housesVisited[i] = Math.max(nums[i]+rob(nums,i+2),rob(nums,i+1));
        return housesVisited[i];
    }
}
