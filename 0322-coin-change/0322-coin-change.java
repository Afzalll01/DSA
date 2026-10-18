class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        int ans=helper(coins,amount,0,dp);
        return (ans!=Integer.MAX_VALUE) ? ans:-1;
    }
    public int helper(int[] coins,int amount,int i,int dp[][]){
        if(i==coins.length){
            if(amount==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][amount]!=-1) return dp[i][amount];
        int skip=helper(coins,amount,i+1,dp);
        if(amount<coins[i]) return dp[i][amount]=skip;
        int take=helper(coins,amount-coins[i],i,dp);
        int pick=(take==Integer.MAX_VALUE) ? Integer.MAX_VALUE:take+1;
        dp[i][amount]=Math.min(skip, pick);
        return Math.min(skip,pick);
    }
}