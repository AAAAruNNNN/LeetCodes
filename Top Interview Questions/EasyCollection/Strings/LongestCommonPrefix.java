package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    
	public static void main(String args[]) {
		LongestCommonPrefix obj = new LongestCommonPrefix();
		System.out.println(obj.longestCommonPrefix(new String[] {"flower","flow","flight"}));
	}
	
	public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        Arrays.sort(strs);
        String common = strs[0];
        for(String i : strs){
            int j=0;
            while(j<i.length() && j<common.length()){
            if(i.charAt(j)!=common.charAt(j))
            {
                if(j==0)
                    return "";
                common = i.substring(0,j);
                break;
            }   
                
                j++;
            }
        }
        return common;
    }
}
