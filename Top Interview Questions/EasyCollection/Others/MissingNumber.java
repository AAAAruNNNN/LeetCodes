package Others;

public class MissingNumber {
	public static void main(String args[]) {
		System.out.println(missingNumber(new int[]{3,0,1}));
	}
    public static int missingNumber(int[] nums) {
        int sum = 0;
        for(int i: nums)
            sum += i;
        int n = nums.length;
        return (int) n*(n+1)/2 - sum;
    }
}
