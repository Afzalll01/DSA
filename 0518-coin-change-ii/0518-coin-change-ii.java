class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        int ans=helper(coins,amount,0,dp);
        return (ans!=Integer.MAX_VALUE) ? ans:-1;
    }
    public int helper(int[] coins,int amount,int i,int dp[][]){
        if(i==coins.length) return 0;
        if(amount==0) return 1;
        if(dp[i][amount]!=-1) return dp[i][amount];
        int skip=helper(coins,amount,i+1,dp);
        if(amount<coins[i]) return dp[i][amount]=skip;
        int pick=helper(coins,amount-coins[i],i,dp);
        return dp[i][amount]=skip+pick;
    }
}