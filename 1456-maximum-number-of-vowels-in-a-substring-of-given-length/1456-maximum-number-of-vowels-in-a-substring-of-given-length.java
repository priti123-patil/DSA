class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int cnt = 0, ans = 0;
        while(j < s.length()) {
            if(j-i+1 < k) {
                if(isVowel(s.charAt(j))) {
                    cnt++;
                }
                j++;
            }
            else if(j-i+1 == k) {
                if(isVowel(s.charAt(j))) {
                    cnt++;
                }
                ans = Math.max(ans,cnt);
                if(isVowel(s.charAt(i))) 
                    cnt--;
                i++;
                j++;
            }
        }
        return ans;
    }
    public boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
}