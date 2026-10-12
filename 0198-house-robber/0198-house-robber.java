class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        int n=nums.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(0,nums);
    }
    public int solve(int i,int[] nums){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+solve(i+2,nums);
        int skip=solve(i+1,nums);
        int ans=Math.max(take,skip);
        dp[i]=ans;
        return ans;
    }
}