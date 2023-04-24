class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                cnt = cnt * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                st.push(cnt);
                strStack.push(sb);
                cnt = 0;
                sb = new StringBuilder();
            } 
            else if (ch == ']') {
                StringBuilder prevStr = strStack.pop();
                int repeatCount = st.pop();
                for (int i = 0; i < repeatCount; i++) {
                    prevStr.append(sb);
                }
                sb = prevStr;
            } 
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}