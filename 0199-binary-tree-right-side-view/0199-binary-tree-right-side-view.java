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
    public List<Integer> rightSideView(TreeNode root) {
        Stack<Integer> ds = new Stack<>();
        reverse_preorder(root, 0, ds);
        List<Integer> ans = new ArrayList<>();
        while(!ds.isEmpty()) {
            ans.add(ds.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
    public void reverse_preorder(TreeNode node, int level, Stack<Integer> ds) {
        if( node == null) return;
        if(ds.size() == level) {
            ds.push(node.val);
        }
        reverse_preorder(node.right, level + 1, ds);
        reverse_preorder(node.left, level + 1, ds);
    }
}