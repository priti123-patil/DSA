class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans = st.stream().map(a -> a.toString()).collect(Collectors.joining(""));
        return ans;
    }
}