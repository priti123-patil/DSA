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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = bfs(root1);
        List<Integer> list2 = bfs(root2);
        if(list1.size() != list2.size()) return false;
        int i = 0;
        while(i < list1.size()) {
            if(list1.get(i) != list2.get(i)) {
                return false;
            }
            else {
                i++;
            }
        }
        return true;
    }
    private List<Integer> bfs(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        List<Integer> list = new ArrayList<>();
        while(!st.isEmpty()) {
            TreeNode node = st.pop();
            if(node.right == null && node.left == null) {
                list.add(node.val);
            }
            if(node.left != null) {
                st.push(node.left);
            }
            if(node.right != null) {
                st.push(node.right);
            }
        }
        return list;
    }
}
