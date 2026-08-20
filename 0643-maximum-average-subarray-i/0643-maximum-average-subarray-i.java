class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=k-1;
        int sum=0;
        int max=0;
        for(int x=0;x<k;x++){
            sum=sum+nums[x];
        }
        max=sum;
        while(j<nums.length-1){
            sum=sum-nums[i];
            i++;
            j++;
            sum=sum+nums[j];
            max = Math.max(max, sum);
        }
        return (double) max/k;
    }
}