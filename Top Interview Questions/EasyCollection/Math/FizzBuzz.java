package Math;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzz {
	public static void main(String args[]) {
		System.out.println(Arrays.toString(fizzBuzz(15).toArray()));
	}
    public static List<String> fizzBuzz(int n) {
        List<String> s = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%15 == 0){
                s.add("FizzBuzz");
                continue;                
            }
            if(i%3 == 0)
                s.add("Fizz");
            else if(i%5 == 0)
                s.add("Buzz");
            else
                s.add(Integer.toString(i));          
        }
        return s;
    }
}
