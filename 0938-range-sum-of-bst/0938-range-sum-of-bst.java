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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans = 0;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        if(root.val >= low && root.val <= high ) {
            ans += root.val;
        }
        while(!st.isEmpty()) {
            TreeNode node = st.pop();
            if(node.left != null) {
                st.push(node.left);
                if(node.left.val >= low && node.left.val <= high) ans += node.left.val;
            }
            if(node.right != null) {
                st.push(node.right);
                if(node.right.val >= low && node.right.val <= high) ans += node.right.val;
            }
        }
        return ans;
    }
}