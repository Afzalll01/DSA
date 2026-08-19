class Solution {
     public List<List<Integer>> Dup(int[] nums,List<List<Integer>> list,List<Integer> sub,int i){
        if(i==nums.length){
            if(!list.contains(sub)){
                list.add(new ArrayList<>(sub));
            }
            return list;
        }
        sub.add(nums[i]);
        Dup(nums,list,sub,i+1);
        sub.remove(sub.size()-1);
        Dup(nums,list,sub,i+1);
        return list;

     }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        Arrays.sort(nums);
        return Dup(nums,list,sub,0);
    }
}