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
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return count;
    }
    
    private int[] dfs(TreeNode node) {
        if(node == null) {
            return new int[]{0, 0};
        } 
        int[] leftResults = dfs(node.left);
        int[] rightResults = dfs(node.right);
        int totalSum = node.val + leftResults[0] + rightResults[0];
        int totalCount = 1 + leftResults[1] + rightResults[1];
        if(node.val == totalSum / totalCount) 
            count++;
        return new int[]{totalSum, totalCount};
    }
}