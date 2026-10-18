class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int ele:nums) total+=Math.abs(ele);
        int[][] dp=new int[nums.length][2*total+1];
        for(int[] arr:dp) Arrays.fill(arr,-1);
        return helper(nums,target,0,0,dp,total);
    }
    public int helper(int[] nums,int target,int i,int sum,int[][] dp,int total){
        if(i==nums.length) return sum==target ? 1:0;
        if(dp[i][sum+total]!=-1) return dp[i][sum+total];
        int add=helper(nums,target,i+1,sum+nums[i],dp,total);
        int sub=helper(nums,target,i+1,sum-nums[i],dp,total);
        return dp[i][sum+total]=add+sub;
    }
}