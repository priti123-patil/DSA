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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        Stack<String> str = new Stack<String>();
        if(root == null) 
            return list;
        st.push(root);
        str.push("");
        while(!st.isEmpty()) {
            TreeNode curNode = st.pop();
            String curStr = str.pop();
        
            if(curNode.left == null && curNode.right == null) 
                list.add(curStr + curNode.val);
            
            if(curNode.left != null) {
                st.push(curNode.left);
                str.push(curStr + curNode.val + "->");
            }
            if(curNode.right != null) {
                st.push(curNode.right);
                str.push(curStr + curNode.val + "->");
            }
        }
        return list; 
    }
}