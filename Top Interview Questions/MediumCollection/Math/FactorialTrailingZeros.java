package Math;
import java.math.BigInteger;
public class FactorialTrailingZeros {
	
	public static void main(String args[]) {
		FactorialTrailingZeros obj = new FactorialTrailingZeros();
		System.out.println(obj.trailingZeroes(4238));
	}
	
    public int trailingZeroes(int n) {
        if(n == 0)
            return 0;
        BigInteger x = factorial(new BigInteger(String.valueOf(n)));
        int count = 0;
        int rem = 0;
        while(x.compareTo(new BigInteger("9")) == 1 && rem == 0){
            BigInteger[] dAndR = x.divideAndRemainder(new BigInteger("10"));
            x = dAndR[0];
            rem = dAndR[1].intValue();
            if(rem == 0)
                count++;
        }
        return count;
    }
    
    public BigInteger factorial(BigInteger n){
        if(n.compareTo(new BigInteger("1")) == 0)
            return new BigInteger("1");
        return n.multiply(factorial(n.subtract(new BigInteger("1"))));
    }
}
