class Solution {
    public int maxScore(int[] nums, int k) {
        int sum=0;
        for(int ele:nums) sum+=ele;
        int n=nums.length;
        int ws=n-k;
        if(ws==0) return sum;
        int curr=0;
        int min=Integer.MAX_VALUE;
        int count=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            curr+=nums[j];
            count++;
            if(count==n-k){
                min=Math.min(curr,min);
                curr-=nums[i++];
                count--;
            }
        }
        return sum-min;
        
    }
}