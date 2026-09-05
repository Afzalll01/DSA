class Solution {
    public int firstStableIndex(int[] nums, int t) {
        int ans=Integer.MAX_VALUE;
        int[] prefMax=new int[nums.length];
        int[] suffMin=new int[nums.length];
        int min=nums[nums.length-1];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            prefMax[i]=max;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
            }
            suffMin[i]=min;
        }
        for(int i=0;i<nums.length;i++){
            if(prefMax[i]-suffMin[i]<=t){
                ans=Math.min(ans,i);
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
        
    }
}