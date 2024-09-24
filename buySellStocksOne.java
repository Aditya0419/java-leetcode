public class buySellStocksOne {
    public static int maxProfit(int[] prices) {
        int maxP=0;
        int bp=Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<bp){
                bp=prices[i];
            }
            int profit=prices[i]-bp;
            if(profit>maxP){
                maxP=profit;
            }
        }

        return maxP;
    }

    public static void main(String args[]){
        int[] arr={7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
