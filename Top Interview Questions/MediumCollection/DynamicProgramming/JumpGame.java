package DynamicProgramming;

public class JumpGame {
	
	public static void main(String args[]) {
		JumpGame obj = new JumpGame();
		System.out.println(obj.canJump(new int[] {3,2,1,0,4}));
	}
	
    public boolean canJump(int[] nums) {
        // if(nums.length == 1)
        //     return true;
//         boolean retVal = true;
//         int count = 0;
//         for(int i = 0; i<nums.length;){
//             if(nums[i] == 0 && i!=nums.length-1){
//                 count++;i++;retVal=false;continue;
//             }
//             if(count>0){
//                 while(i-count-1>=0){
//                     retVal = nums[i-count-1]>count?true:false;
//                     if(retVal == true)
//                         break;
//                     count++;
                    
//                 }
//                 if(retVal == false)
//                     return false;
//             }
//             i++;count = 0;
//         }
//         return retVal;
        
        //Dynamic Programming soln:
        // int[] arr = new int[nums.length];
        // arr[nums.length - 1] = 1;
        // for(int i = nums.length - 2; i >= 0; i--){
        //     for(int j = 1; j<=nums[i]; j++){
        //         if(j+i<nums.length && arr[j+i] == 1){
        //             arr[i] = 1;
        //             break;
        //         }
        //     }
        // }
        // return arr[0] == 1?true:  false;
        
        //Greedy:
        int lastPos = nums.length - 1;
        for(int i = nums.length - 1; i>=0; i--){
            if(i+nums[i] >= lastPos)
                lastPos = i;
        }
        return lastPos == 0? true: false;
    }
}
