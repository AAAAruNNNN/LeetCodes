package Strings;

public class CountAndSay {
	
	public static void main(String args[]) {
		CountAndSay obj = new CountAndSay();
		System.out.println(obj.countAndSay(5));
	}
	
	// 1.     1
	// 2.     11
	// 3.     21
	// 4.     1211
	// 5.     111221
	    public String countAndSay(int n) {
	        String val = "1";
	        String newVal = "";
	        int count = 0;
	        int value = 1;
	        while(n>1){
	            char[] c = val.toCharArray();
	            for(int i = 0; i<c.length; i++){
	                if(value != Integer.parseInt(String.valueOf(c[i]))){
	                    newVal += String.valueOf(count) + String.valueOf(value);
	                    count = 0;
	                }
	                value = Integer.parseInt(String.valueOf(c[i]));
	                count++;
	            }
	            newVal += String.valueOf(count) + String.valueOf(value);
	            val = newVal;
	            newVal = "";
	            value = Integer.parseInt(String.valueOf(val.charAt(0)));
	            count = 0;
	            n--;
	        }
	        return val;
	    }
}
