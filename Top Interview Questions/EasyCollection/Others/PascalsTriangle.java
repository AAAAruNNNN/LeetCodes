package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {
	public static void main(String args[]) {
		System.out.println(Arrays.toString(generate(5).toArray()));
	}
    public static List<List<Integer>> generate(int numRows) {
        if(numRows < 1)
            return null;
        List<Integer> prev = new ArrayList<Integer>(), curr = new ArrayList<Integer>();
        List<List<Integer>> retVal = new ArrayList<List<Integer>>();
        prev.add(1);
        for(int i = 0; i<numRows; i++){
            retVal.add(prev);
            if(prev.size() > 1){
                curr.add(1);
                for(int j = 0;j<prev.size()-1;j++){
                    curr.add(prev.get(j)+prev.get(j+1));
                }
                curr.add(1);
                Collections.copy(prev, curr);
            }
            else
                prev.add(1);
        }
        return retVal;
    }
}
