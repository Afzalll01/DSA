class Solution {
    int[][] dp;
    public int minDistance(String a, String b) {
        int m=a.length();
        int n=b.length();
        dp=new int[m][n];
        return edit(a,b,0,0);
    }
    public int edit(String a,String b,int i,int j){
        if(i>=a.length()) return b.length()-j;
        if(j>=b.length()) return a.length()-i;
        if(dp[i][j]!=0) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j]=edit(a,b,i+1,j+1);
        int replace=1+ edit(a,b,i+1,j+1);
        int insert=1+edit(a,b,i+1,j);
        int delete=1+edit(a,b,i,j+1);
        return dp[i][j]=Math.min(replace,Math.min(insert,delete));
    }
}