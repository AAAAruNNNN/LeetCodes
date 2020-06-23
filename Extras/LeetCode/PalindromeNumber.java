package LeetCode;

public class PalindromeNumber {
	public static void main(String args[]) {
		System.out.println(isPalindrome(-121));
	}
    public static boolean isPalindrome(int x) {
        // String s = String.valueOf(x);
        // for(int i=0,j=s.length()-1;i<j;i++,j--){
        //     if(s.charAt(i) != s.charAt(j))
        //         return false;
        // }
        // return true;
        if(x<0) return false;
        long temp = 0,retVal=0,num = x;
        while(num>0){
            temp = num%10;
            num = num/10;
            retVal = retVal*10 + temp;
        }
        return retVal == x;
    }
}
