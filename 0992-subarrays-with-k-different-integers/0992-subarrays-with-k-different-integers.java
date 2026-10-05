class Solution {
    public int atmost(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0) map.remove(nums[i]);
                i++;
            }
            max+=j-i;
        }
        return max;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}