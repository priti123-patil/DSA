class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> str1 = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c == '#'){
                if(!str1.isEmpty()){
                    str1.remove(str1.size() - 1);
                }
            }
            else {
                str1.add(c);
            }
        }
        ArrayList<Character> str2 = new ArrayList<>();
        for(char c : t.toCharArray()){
            if(c == '#'){
                if(!str2.isEmpty()){
                    str2.remove(str2.size() - 1);
                }
            }
            else { 
                str2.add(c);
            }
        }
        String a = Arrays.toString(str1.toArray());
        String b = Arrays.toString(str2.toArray()); 
        return (a.equals(b));
    }
}