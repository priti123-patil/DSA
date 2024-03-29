class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack();
        int i = 0;
        for (int x: pushed) {
            s.push(x);
            while (!s.isEmpty() && i < pushed.length && s.peek() == popped[i]) {
                s.pop();
                i++;
            }
        }

        return (i == pushed.length);
    }
}