class Solution {
    public int rob(int[] nums) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            int c=Math.max(b,a+nums[i]);
            a=b;
            b=c;
        }
        return b;
    }
}