class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]!= nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }else if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    i=mid+2;
                }else{
                    j=mid-1;
                }
            }else if(mid%2!=0){
                if(nums[mid]==nums[mid-1]){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
        }
        return -1;
    }
}