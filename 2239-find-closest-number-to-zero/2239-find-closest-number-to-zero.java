class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=nums[0];
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(nums[ind])){
                ans=nums[i];
                ind=i;
            }
            else if(Math.abs(nums[i])==Math.abs(nums[ind])) ans=Math.max(nums[ind],nums[i]);
        }
        return ans;
    }
}