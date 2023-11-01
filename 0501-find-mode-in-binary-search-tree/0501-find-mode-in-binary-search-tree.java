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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.empty()) {
            TreeNode node = st.pop();
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);
            if(node.left != null) {
                st.push(node.left);
            }
            if(node.right != null) {
                st.push(node.right);
            }
        }
        int maxFreq = 0;
        for(int key : map.keySet()) {
            maxFreq = Math.max(map.get(key), maxFreq);
        }
        List<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == maxFreq) {
                ans.add(key);
            }
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}