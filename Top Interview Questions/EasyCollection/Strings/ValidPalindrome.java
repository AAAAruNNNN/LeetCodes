package Strings;

public class ValidPalindrome {
	
	public static void main(String args[]) {
		ValidPalindrome obj = new ValidPalindrome();
		System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
	}
	
    public boolean isPalindrome(String s) {
        // List<Character> list = new ArrayList<Character>();
        // for(int i=0;i<s.length();i++){
        //     char c = s.charAt(i);
        //     if(c >= 'a' && c<='z' || c >='A' && c<='Z')
        //         list.add(Character.toLowerCase(c));
        //     else if(c >= '0' && c<='9')
        //         list.add(c);
        // }
        // for(int i=0,j=list.size()-1;i<j;i++,j--){
        //     if(list.get(i)!=list.get(j))
        //         return false;
        // }
        // return true;
        for(int i=0,j=s.length()-1;i<j;){
            char start = s.charAt(i),end = s.charAt(j);
            if(!isAlphaNum(start)){
                i++;
                continue;
            }
            if(!isAlphaNum(end)){
                j--;
                continue;
            }            
            if(Character.toLowerCase(start) != Character.toLowerCase(end))
                return false;
            i++;j--;
        }    
        return true;
    }
    public boolean isAlphaNum(char c){
        return (c >= 'a' && c<='z' || c >='A' && c<='Z' || c>='0' && c<='9');
    }
}
