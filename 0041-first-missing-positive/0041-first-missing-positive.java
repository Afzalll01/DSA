class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int i=1;
        while(i<Integer.MAX_VALUE){
            if(!map.containsKey(i)) return i;
            i++;
        }
        return -1;

    }
}