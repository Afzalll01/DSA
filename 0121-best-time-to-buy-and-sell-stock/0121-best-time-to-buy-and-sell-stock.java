class Solution {
    public int maxProfit(int[] prices) {
        int st=0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[st]>0){
                max=Math.max(max,prices[i]-prices[st]);
            }
            else{
                st=i;
            }
            
        }
        return max;
    }
}