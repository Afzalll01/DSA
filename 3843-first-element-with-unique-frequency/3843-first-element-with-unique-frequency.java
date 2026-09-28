class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele: nums) map.put(ele,map.getOrDefault(ele,0)+1);
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int ele:map.values()) map2.put(ele,map2.getOrDefault(ele,0)+1);
        for(int ele:nums){
            if(map2.get(map.get(ele))==1) return ele;
        }
        return -1;
    }
}