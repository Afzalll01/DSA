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
    public void Order(TreeNode root,List<List<Integer>> ans,int level){
        if(root==null) return;
        if(ans.size()==level){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);
        Order(root.left,ans,level+1);
        Order(root.right,ans,level+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        Order(root,l,0);
        return l;
    }
}