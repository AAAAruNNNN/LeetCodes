package Others;

public class SingleElementInASortedArray {

	public static void main(String args[]) {
		System.out.println(singleNonDuplicate(new int[] {1,1,2,3,3,4,4}));
	}
	
    public static int singleNonDuplicate(int[] nums) {
        int sum = 0;
        for(int i: nums){
            sum ^= i;
        }

        return sum;
                
    }
}
