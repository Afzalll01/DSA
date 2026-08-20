class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==target){
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }else if(sum<target){
                i++;
            }else j--;
        }
        return arr;
    }
}