class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)) l.add(i);
        }
        return l;
    }
}