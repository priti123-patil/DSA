class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0, k = 0;
        char[] ans = new char[word1.length() + word2.length()];
        while(i < word1.length() && j < word2.length()){
            ans[k] = word1.charAt(i);
            k += 1;
            ans[k] = word2.charAt(j);
            k += 1;
            i++;
            j++;
        }
        while(i < word1.length()){
            ans[k] = word1.charAt(i);
            i++;
            k++;
        }
        while(j < word2.length()){
            ans[k] = word2.charAt(j);
            j++;
            k++;
        }
        return String.valueOf(ans);
    }
}