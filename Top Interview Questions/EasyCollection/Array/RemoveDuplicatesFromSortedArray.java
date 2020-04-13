package Array;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String args[]) {
		/*
		 * This function returns only a int value (length which is needed to print the
		 * array, which is taken care by leetcode
		 */
		System.out.println(removeDuplicates(new int[] { 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 6 }));
	}

	public static int removeDuplicates(int[] nums) {
		int count, pos = 1;
		if (nums.length == 0)
			count = 0;
		else
			count = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[pos++] = nums[i + 1];
				count++;
			}
		}
		return count;
	}

}
