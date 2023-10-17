class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int root = findRoot(n, leftChild, rightChild);
        if(root == -1) {
            return false;
        }
        Set<Integer> seen = new HashSet<>();
        seen.add(root);
        Stack<Integer> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            int node = stack.pop();
            int[] children = {leftChild[node], rightChild[node]};
            for(int child : children) {
                if(child != -1) {
                    if(seen.contains(child)) {
                        return false;
                    }
                    stack.push(child);
                    seen.add(child);
                }
            }
        }
        return (seen.size() == n);
    }
    public int findRoot(int n, int[] leftChild, int[] rightChild) {
        Set<Integer> children = new HashSet<>();
        for(int c : leftChild) {
            children.add(c);
        }
        for(int c : rightChild) {
            children.add(c);
        }
        for(int i = 0; i < n; i++) {
            if(!children.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}