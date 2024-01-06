class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle == null) return -1;
        int ans = 0;
        for(char c: columnTitle.toUpperCase().toCharArray() ){
            ans *= 26;
            ans += c - 'A' + 1;
        }
        return ans;
    }
}