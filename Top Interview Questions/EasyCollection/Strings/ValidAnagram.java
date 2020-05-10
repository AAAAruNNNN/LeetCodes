package Strings;

public class ValidAnagram {
	
	public static void main(String args[]) {
		System.out.println(isAnagram("car","arc"));
	}

    public static boolean isAnagram(String s, String t) {
        // int n1= s.length();
        // int n2= t.length();
        // if(n1 == n2){
        // HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // for(int i = 0; i< n1; i++){
        //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i = 0; i< n2; i++){
        //     map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
        // }
        // for(Map.Entry<Character,Integer> e : map.entrySet()){
        //     if(e.getValue() != 0)
        //         return false;
        // }
        //     return true;
        // }      
        // return false;

        int[] characters = new int[26];
        for(char i: s.toCharArray()){
            characters[i-'a']++;
        }
        for(char i: t.toCharArray()){
            characters[i-'a']--;
        }
        for(int i: characters)
            if(i!=0)
                return false;
        return true;
    	}
}
