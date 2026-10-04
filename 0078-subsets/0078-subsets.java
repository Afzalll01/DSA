class Solution {
    public List<List<Integer>> sub(List<List<Integer>> ans,int i,int[] nums,List<Integer> l){
        if(i==nums.length){
            ans.add(new ArrayList<>(l));
            return ans;
        }
        l.add(nums[i]);
        sub(ans,i+1,nums,l);
        l.remove(l.size()-1);
        sub(ans,i+1,nums,l);
        return ans;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        sub(ans,0,nums,l);
        return ans;
    }
}