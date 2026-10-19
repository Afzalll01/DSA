class Solution {
    static Boolean[] dp;
    public boolean canJump(int[] nums) {
        dp=new Boolean[nums.length];
        return helper(nums,0);
    }
    public boolean helper(int[] nums,int i){
        if(i>=nums.length-1) return true;
        if(dp[i]!= null) return dp[i];
        for(int j=1;j<=nums[i];j++){
            if(helper(nums,i+j)) return dp[i]=true;
        }
        return dp[i]=false;
    }
}