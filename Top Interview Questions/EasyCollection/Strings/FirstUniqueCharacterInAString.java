package Strings;

public class FirstUniqueCharacterInAString {
	public static void main(String args[]) {
		System.out.println(firstUniqChar("loveleetcode"));
	}
	public static int firstUniqChar(String s) {
		for(char i: s.toCharArray()) {
			if(s.indexOf(i) == s.lastIndexOf(i))
				return s.indexOf(i);
		}
		return -1;
	}
}
