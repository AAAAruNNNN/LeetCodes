package LeetCode;

public class Sqrt {
    static int mid;
    public static int mySqrt(int x) {
        int l = 0, r = x;
        long pow=0;
        while(l<=r){
            mid = l + (r - l)/2;
            pow = (long) mid * mid;
            if(pow == x)
                return mid;
            if(pow > x)
                r = mid-1;
            else
                l = mid+1;
                
        }
        return x<mid*mid? mid-1: mid;
    }
    
    public static void main(String args[]) {
    	System.out.println(mySqrt(Integer.MAX_VALUE));
    }
}
