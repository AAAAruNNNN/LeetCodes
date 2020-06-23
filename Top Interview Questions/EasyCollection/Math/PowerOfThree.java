package Math;

public class PowerOfThree {
	
	public static void main(String args[]) {
			System.out.println(isPowerOfThree(27));
	}
	
    public static boolean isPowerOfThree(int n) {
        long pow = 1;
        int i = 0;
        while(pow<=n){
            pow = (long) Math.pow(3,i++);
            if(pow == n)
                return true;
        }
        return false;
    }
}
