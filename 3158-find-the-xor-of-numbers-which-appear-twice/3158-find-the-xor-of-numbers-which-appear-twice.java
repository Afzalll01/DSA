class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        int xor=0;
        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])){
                xor^=nums[i];
            }
            map.add(nums[i]);
        }
        return xor;
    }
}