class Solution {
    public int longestOnes(int[] nums, int k) {
        int st=0;
        int end=0;
        int count=0;
        int max=0;
        while(end!=nums.length){
            if(nums[end]==0) count++;
            while(count>k){
                if(nums[st]==0){
                    count--;
                }
                st++;
            }
            max=Math.max(max,end-st+1);
            end++;
        }
        return max;
    }
}