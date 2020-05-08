package Strings;

public class ReverseInteger {
public static void main(String args[]) {
	System.out.println(reverseInteger(-1234556));
}
public static int reverseInteger(int n) {
	int retVal = 0;
	int pop;
	while(n!=0) {
		pop = n%10;
		n /= 10;
		if(retVal > Integer.MAX_VALUE/10 || retVal == Integer.MAX_VALUE/10 && pop > 7) 
			return 0;
		if(retVal < Integer.MIN_VALUE/10 || retVal == Integer.MAX_VALUE/10 && pop < -8) 
			return 0;
		retVal = retVal*10 + pop;
	}
	
	return retVal;
}
}
