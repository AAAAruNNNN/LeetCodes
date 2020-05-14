package Others;

public class SingleElementInASortedArray {

	public static void main(String args[]) {
//		System.out.println(singleNonDuplicate(new int[] {1,1,2,3,3,4,4}));
//String s = "strawberries";
//System.out.println(s.substring(5,2));
		try {
			System.out.println("Hello");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("3");
		}
	}
	
    public static int singleNonDuplicate(int[] nums) {
        int sum = 0;
        for(int i: nums){
            sum ^= i;
        }

        return sum;
                
    }
}
