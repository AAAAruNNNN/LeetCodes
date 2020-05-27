package LeetCode;

public class SearchInsertPosition {
	public static void main(String args[]) {
		System.out.println(searchInsert(new int[] {1,4,5,7,8}, 7));
	}
    public static int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int mid=0;
        while(l<r){
            mid = l + (r - l)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                r = mid;
            else
                l = mid + 1;
        }

        if(nums[r] == target) return r;
        return nums[r]>target?r:r+1;
    }
}
