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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null) 
            return ans;
        TreeNode cur = null;
        Queue<TreeNode> curLev = new LinkedList<TreeNode>();
        curLev.add(root);
        while (!curLev.isEmpty()) {
            List<Integer> oneLevel = new ArrayList<Integer>();
            Queue<TreeNode> temp = new LinkedList<TreeNode>();
            while(!curLev.isEmpty()) {
                cur = curLev.remove();
                oneLevel.add(cur.val);
                if (cur.left != null)  temp.add(cur.left); 
                if (cur.right != null) temp.add(cur.right);
            }
            ans.add(0,oneLevel);//it is adding a list at the first everytime so that we will get reverse
            curLev = temp;
        }
        return ans;
    }
}