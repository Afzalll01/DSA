class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        return solve(m-1,n-1);
    }
    public int solve(int m,int n){
        if(m==0 || n==0) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        return dp[m][n]=solve(m,n-1)+solve(m-1,n);
    }
}