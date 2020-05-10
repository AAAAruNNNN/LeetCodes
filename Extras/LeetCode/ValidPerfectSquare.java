package LeetCode;

public class ValidPerfectSquare {
	public static void main(String args[]){
		System.out.println(isPerfectSquare(2));
	}
    public static boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        int mid;long pow=0;
        while(l<=r){
            mid = l + (r - l)/2;
            pow = (long) mid * mid;
            if(pow == num)
                return true;
            if(pow > num)
                r = mid - 1;
            else
                l = mid + 1;
                
        }
        return false;
    }
}
