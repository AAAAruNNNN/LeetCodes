package DynamicProgramming;

public class MaximumSubarray {

	public static void main(String args[]) {
		MaximumSubarray obj = new MaximumSubarray();
		System.out.println(obj.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

	public int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE, sum = 0;
		for (int i : nums) {
			sum = Math.max(i, i + sum);
			maxSum = Math.max(maxSum, sum);

		}
		return maxSum;
	}
}
