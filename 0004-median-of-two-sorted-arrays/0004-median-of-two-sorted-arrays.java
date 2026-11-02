class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int i =0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                arr[k]=nums2[j];
                k++;
                j++;
            }
            else{
                arr[k]=nums1[i];
                k++;
                i++;
            }
        }
        while(i<nums1.length){
            arr[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            arr[k]=nums2[j];
            k++;
            j++;
        }
        if(arr.length%2==0){
            return (double) (arr[arr.length/2]+arr[(arr.length/2)-1])/2;
        }
        else{
            return (double) arr[arr.length/2];
        }
    }
}