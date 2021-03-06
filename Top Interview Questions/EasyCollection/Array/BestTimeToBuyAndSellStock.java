package Array;

public class BestTimeToBuyAndSellStock {
    
	public static void main(String args[]) {
		System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
	}
	
	public static int maxProfit(int[] prices) {
        // [7,1,5,3,6,4] ---> 7
        int maxProfit = 0;
        for(int i=0;i<prices.length-1;i++){
               if(prices[i] < prices[i+1]){
                   maxProfit+= prices[i+1]-prices[i];
               }
        }
        return maxProfit;
    }
}
