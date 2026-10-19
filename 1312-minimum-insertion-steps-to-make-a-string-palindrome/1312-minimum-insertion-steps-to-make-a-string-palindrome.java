class Solution {
    static int[][] dp;
    public int minInsertions(String s) {
        dp=new int[s.length()][s.length()];
        for(int[] a:dp) Arrays.fill(a,-1);
        return s.length()-helper(s,0,s.length()-1);
    }
    public int helper(String s,int i,int j){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j]; 
        if(s.charAt(i)==s.charAt(j)) return dp[i][j]=2+helper(s,i+1,j-1);
        else return dp[i][j]= Math.max(helper(s,i+1,j),helper(s,i,j-1));
    }
}