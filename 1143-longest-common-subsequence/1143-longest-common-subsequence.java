class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()][text2.length()];
        for(int[] a: dp) Arrays.fill(a,-1); 
        return helper(text1,text2,0,0);
    }
    public int helper(String a,String b,int i,int j){
        if(i==a.length() || j==b.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j]= 1 + helper(a,b,i+1,j+1);
        else return dp[i][j]=Math.max(helper(a,b,i,j+1),helper(a,b,i+1,j));
    }
}