class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less=0;
        int great=0;
        int equal=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) less++;
            if(nums[i]>pivot) great++;
            if(nums[i]==pivot) equal++;
        }
        int i=0,j=less,k=less+equal;
        for(int l=0;l<nums.length;l++){
            if(nums[l]<pivot){
                arr[i++]=nums[l];
            }else if(nums[l]==pivot){
                arr[j++]=nums[l];
            }else{
                arr[k++]=nums[l];
            }
        }
        return arr;
    }
}