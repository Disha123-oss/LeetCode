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
    HashSet<Integer> hs = new HashSet<>();
    public boolean find(TreeNode root, int k){
        if(root==null)  return false;
        if(hs.contains(k-root.val))
            return true;
        else
            hs.add(root.val);
        return find(root.left,k) || find(root.right,k);
    }
    public boolean findTarget(TreeNode root, int k) {
        return find(root,k);
    }
}