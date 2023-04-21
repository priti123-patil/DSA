class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length(); i++){
            if(!stack.isEmpty()){
                if(stack.peek() == s.charAt(i)){
                    stack.pop();
                    sb.deleteCharAt(sb.length() - 1);
                    continue;
                } 
            }
            stack.push(s.charAt(i));
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}