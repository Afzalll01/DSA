class Solution {
    public void Order(TreeNode root,int level,List<List<Integer>> ans){
        if(root==null) return;
        if(ans.size()==level) ans.add(new ArrayList<>());
        ans.get(level).add(root.val);
        Order(root.left,level+1,ans);
        Order(root.right,level+1,ans);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        Order(root,0,l);
        for(int i=0;i<l.size();i++){
            if(i%2!=0){
                Collections.reverse(l.get(i));
            }
        }
        return l;
    }
}