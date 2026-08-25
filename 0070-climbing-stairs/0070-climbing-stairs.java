class Solution {
    public int ways(int n,int[] dp){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
        int take=ways(n-1,dp);
        int skip=ways(n-2,dp);
        return dp[n]=take+skip;
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        return ways(n,dp);
    }
}