package Array;

import java.util.HashMap;

public class ContainsDuplicate {
	public static void main(String args[]) {
		System.out.println(containsDuplicate(new int[] { 2, 2, 3, 3, 5, 8, 8 }));
	}

	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> duplicateCount = new HashMap<>();
		for (int elem : nums) {
			duplicateCount.put(elem, duplicateCount.getOrDefault(elem, 0) + 1);
		}
		for (int value : duplicateCount.values()) {
			if (value > 1)
				return true;
		}
		return false;
	}
}
