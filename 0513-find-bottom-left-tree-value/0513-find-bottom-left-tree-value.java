/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void Order(TreeNode root,int level,List<List<Integer>> ans){
        if(root==null) return;
        if(ans.size()==level) ans.add(new ArrayList<>());
        ans.get(level).add(root.val);
        Order(root.left,level+1,ans);
        Order(root.right,level+1,ans);
    }
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        Order(root,0,l);
        return l.get(l.size()-1).get(0);
    }
}