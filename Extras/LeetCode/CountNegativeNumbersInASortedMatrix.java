package LeetCode;

public class CountNegativeNumbersInASortedMatrix {
	public static void main(String args[]) {
		int[][] grid = {{3,2,1,1,1,1,0,-1,-2},{-1,-1,-2}};
		System.out.println(countNegatives(grid));
	}
	public static int countNegatives(int[][] grid) {
        int count = 0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[i].length;j++){
        //         if(grid[i][j] < 0)
        //             count++;
        //     }
        // }
        for(int i=0;i<grid.length;i++){
            count+=binarySearch(grid[i]);
        }
        return count;
    }
    
    public static int binarySearch(int[] nums){
    int left = 0, right = nums.length - 1;
    while (left + 1 < right){
        int mid = left + (right - left) / 2;
        if (nums[mid] < 0 && nums[mid-1] >= 0) {
            return nums.length - mid;
        } else if (nums[mid] >= 0) {
            left = mid;
        } else {
            right = mid;
        }
    }

    // Post-processing:
    // End Condition: left + 1 == right
    if(nums[left] < 0) return nums.length-left;
    if(nums[right] < 0) return nums.length-left-1;
    return 0;
    }
}

// [[4,3,2,-1],
//  [3,2,1,-1],
//  [1,1,-1,-2],
//  [-1,-1,-2,-3]]