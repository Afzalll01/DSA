class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int max=0;
        for(int j=1;j<prices.length;j++){
            if(prices[j]-prices[i]>0){
                if(prices[j]-prices[i]>max) max=prices[j]-prices[i];
            }
            else{
                i=j;
            }
        }
        return max;
    }
}