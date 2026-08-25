class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length<3) return nums;
        long xor=0;
        for(int ele:nums){
            xor^=ele;
        }
        int[] res=new int[2];
        int u1=0;
        int u2=0;
        long r = xor & -xor; 
        for(int i=0;i<nums.length;i++){
            if((nums[i]&r)==0){
                u1^=nums[i];
            }
            else u2^=nums[i];
        }
        res[0]=u1;
        res[1]=u2;
        return res;
    }
}