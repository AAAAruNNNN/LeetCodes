package DynamicProgramming;

import java.util.ArrayList;

public class ClimbingStairs {
	
	public static void main(String args[]) {
		ClimbingStairs obj = new ClimbingStairs();
		System.out.println(obj.climbStairs(5));
	}
	
    public int climbStairs(int n) {
        ArrayList<Integer> tab = new ArrayList<Integer>();
        tab.add(1);
        tab.add(2);
        for(int i = 2;i<n; i++){
            tab.add(tab.get(i-1).intValue() + tab.get(i-2).intValue());
        }
        return tab.get(n-1).intValue();
    }
}
