package Array;

import java.util.Arrays;

public class PlusOne {

	public static void main(String args[]) {
		System.out.println(Arrays.toString(plusOne(new int[] { 9,9,9 })));
	}

	public static int[] plusOne(int[] digits) {
		int temp = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] += 1;
			if (digits[i] != 10) {
				temp = 0;
				break;
			} else {
				digits[i] = 0;
				temp = 1;
			}
		}
		if (temp == 1) {
			int[] newDigits = new int[digits.length + 1];
			newDigits[0] = temp;
			for (int i = 0; i < digits.length; i++) {
				newDigits[i + 1] = digits[i];
			}
			return newDigits;
		}
		return digits;
	}
}
