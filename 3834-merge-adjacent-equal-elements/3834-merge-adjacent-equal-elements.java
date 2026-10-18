class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        ArrayList<Long> list=new ArrayList<>();
        Stack<Long> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            long curr=nums[i];
            while(st.size()>0 && st.peek()==curr){
                curr=curr+st.pop();
            }
            st.push(curr);
        }
        while(st.size()>0){
            list.add(st.pop());
        }
        Collections.reverse(list);
        return list;
    }
}