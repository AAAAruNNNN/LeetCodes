package Strings;

public class ReverseInteger {
public static void main(String args[]) {
	System.out.println(reverseInteger(-1234556));
}
public static int reverseInteger(int n) {
//	int retVal = 0;
//	int pop;
//	while(n!=0) {
//		pop = n%10;
//		n /= 10;
//		if(retVal > Integer.MAX_VALUE/10 || retVal == Integer.MAX_VALUE/10 && pop > 7) 
//			return 0;
//		if(retVal < Integer.MIN_VALUE/10 || retVal == Integer.MAX_VALUE/10 && pop < -8) 
//			return 0;
//		retVal = retVal*10 + pop;
//	}
//	
//	return retVal;
	
    long ret=0, pop = 0;
    while(n!=0){
        pop = n%10;
        n/=10;
        ret = ret*10 + pop;
    }
    return ret>Integer.MAX_VALUE || ret<Integer.MIN_VALUE?0:(int)ret;
}
}
