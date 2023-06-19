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
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;
    public void recoverTree(TreeNode root) {
        traverse(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    public void traverse(TreeNode root){
        if(root == null){
            return ;
        }
        traverse(root.left);
        if(prev != null){
            if(first == null && prev.val >= root.val){
                first = prev;
            }
        }
        if(first != null && prev.val >= root.val){
            second = root;
        }
        prev = root;
        traverse(root.right);
    }
}