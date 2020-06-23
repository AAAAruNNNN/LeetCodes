package Others;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String args[]) {
		System.out.println(isValid("()[]{}"));
	}
    public static boolean isValid(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '[')
                stack.push(c+1);                       
            else
                if(c != stack.pop())
                    return false;  
        }
        return true;     
        }
}
