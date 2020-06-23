package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays {
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(intersect(new int[] {1,2,3,4,5,6,7,8}, new int[]{2,5,7,9})));
	}
	
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: nums1)
            map.put(i, map.getOrDefault(i,0)+1);
        for(int i: nums2){
            if(map.get(i)!=null && map.get(i)>0){
                arr.add(i);
                map.put(i, map.get(i)-1);
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}
