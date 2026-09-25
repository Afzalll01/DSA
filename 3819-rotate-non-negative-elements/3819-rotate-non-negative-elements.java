class Solution {
    public void reverse(int[] nums,int i ,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public int[] rotate(int[] nums,int k){
        int n=nums.length;
        if (n == 0) return nums;
        k=k%n;
        if(k<1) return nums;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
        return nums;
    }
    public int[] rotateElements(int[] nums, int k) {
        int pos=0;
        for(int i:nums){
            if(i>=0) pos++;
        }
        int[] arr=new int[pos];
        int j=0;
        for(int num:nums){
            if(num>=0) arr[j++]=num;
        }
        arr=rotate(arr,k);
        j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) nums[i]=arr[j++];
        }
        return nums;
    }
}