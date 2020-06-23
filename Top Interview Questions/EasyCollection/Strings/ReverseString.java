package Strings;

import java.util.Arrays;

public class ReverseString {
    public static char[] reverseString(char[] s) {
        char temp;
        for(int i = 0, j = s.length-1 ; i < j ; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }  
        return s;
    }
    
    public static void main(String args[]) {
    	System.out.println(Arrays.toString(reverseString(new char[] {'h','e','l','l','o'})));
    }
}
