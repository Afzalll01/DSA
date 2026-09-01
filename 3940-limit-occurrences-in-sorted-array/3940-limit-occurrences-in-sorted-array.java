class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int j=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                count=1;
            }else{
                count++;
            }
            if(count<=k){
                nums[j++]=nums[i];
            }
        }
        return Arrays.copyOf(nums,j);
    }
}