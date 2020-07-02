package DynamicProgramming;

public class BestTimeToBuyAndSellStock {
	
	public static void main(String args[]) {
		BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
		System.out.println(obj.maxProfit(new int[] {7,1,5,4,6,8}));
	}
	
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length == 0)
            return maxProfit;
        int low = prices[0];
        for(int i: prices){
            if(i<low){
                low = i;
                continue;
            }
            if(maxProfit<i-low)
                maxProfit = i - low;
        }
        return maxProfit;
    }
}
