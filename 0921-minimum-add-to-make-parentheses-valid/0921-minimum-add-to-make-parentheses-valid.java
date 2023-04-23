class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '(') {
                st.push(S.charAt(i));
            }
            else if(!st.isEmpty() && st.peek() == '(' && S.charAt(i) == ')'){
                st.pop();
            }
            else {
                st.push(S.charAt(i));
            }
        }
        return st.size();
    }
}