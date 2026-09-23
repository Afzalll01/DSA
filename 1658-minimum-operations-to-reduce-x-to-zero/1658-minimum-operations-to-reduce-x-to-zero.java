class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
        int tar=sum-x;
        if (tar < 0) return -1;
        int i=0;
        int maxsum=0;
        int max=-1;
        for(int j=0;j<nums.length;j++){
            maxsum+=nums[j];
            while(maxsum>tar){
                maxsum-=nums[i++];
            }
            if(maxsum==tar){
                max=Math.max(j-i+1,max);
            }
        }
        if(max==-1) return -1;
        return nums.length-max;
    }
}