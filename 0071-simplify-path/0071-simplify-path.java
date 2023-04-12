class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] p = path.split("/");
        for (int i = 0; i < p.length; i++) {
            if (!s.empty() && p[i].equals("..")){
                s.pop();
            }
            else if (!p[i].equals(".") && !p[i].equals("") && !p[i].equals("..")){
                s.push(p[i]);
            }
        }
        List<String> list = new ArrayList(s);
        String ans = "/" + String.join("/", list);
        return ans;
    }
}