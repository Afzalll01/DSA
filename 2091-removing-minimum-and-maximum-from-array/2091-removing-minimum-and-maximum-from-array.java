class Solution {
    public int minimumDeletions(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int m=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                m=i;
            }
            if(nums[i]>max){
                max=nums[i];
                n=i;
            }
        }
        if(m>n){
            int temp=m;
            m=n;
            n=temp;
        }
        int f=(m+1)+(nums.length - n);
        int sec=(n+1);
        int third=(nums.length-m);
        return Math.min(f,Math.min(sec,third));

    }
}