class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int count=0;
        int max=0;
        while(j<nums.length){
            if(nums[j]==0){
                count++;
            }
            if(count>1){
                if(nums[i]==0){
                    count--;
                }
                i++;
            }
            max=Math.max(max,j-i);
            j++;
        }
        return max;
    }
}