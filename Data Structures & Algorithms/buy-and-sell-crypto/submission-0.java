class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],profit=0,maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            profit=prices[i]-min;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}
