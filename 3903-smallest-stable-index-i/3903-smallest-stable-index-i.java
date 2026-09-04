class Solution {
    public int firstStableIndex(int[] nums, int t) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int max=nums[0];
            int min=nums[nums.length-1];
            for(int j=0;j<=i;j++){
                if(nums[j]>max){
                    max=nums[j];
                }
            }
            for(int k=i;k<nums.length;k++){
                if(nums[k]<min){
                    min=nums[k];
                }
            }
            if(max-min <=t){
                ans=Math.min(ans,i);
            }

        }
            if(ans==Integer.MAX_VALUE){
                return -1;
            }
        return ans;
    }
}