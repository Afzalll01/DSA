class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        if(n==1) return nums; 
        int[] f=new int[n-(n/2)];
        int[] s=new int[n/2];
        for(int i=0;i<n-(n/2);i++){
            f[i]=nums[i];
        }
        for(int i=0;i<n/2;i++){
            s[i]=nums[n-(n/2)+i];
        }
        f=sortArray(f);
        s=sortArray(s);
        return mergesortArray(f,s);
    }
    public int[] mergesortArray(int[] nums1,int[] nums2){
        int[] arr=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i!=nums1.length && j!=nums2.length){
            if(nums1[i]<=nums2[j]){
                arr[k++]=nums1[i++];
            }else{
                arr[k++]=nums2[j++];
            }

        }
            while(i!=nums1.length){
                arr[k++]=nums1[i++];
            }
            while(j!=nums2.length){
                arr[k++]=nums2[j++];
            }
            return arr;
    }
}