class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2) return 0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,nums[i+1]-nums[i]);
        }
        return max;
    }
}