class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        for(int i=k;i<=k*1000;i=i+k){
            if(!set.contains(i)) return i;
        }
        return 8;
    }
}