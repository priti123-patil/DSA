class Solution {
    public static int solve(int[][] dp, int i, int j, String s) {
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        dp[i][j] = 0;
        if (i == j) {
            return dp[i][j] = 1;
        }
        if (j - i == 1) {
            if (s.charAt(i) == s.charAt(j)) {
                return dp[i][j] = 1;
            } else {
                return dp[i][j];
            }
        }
        if (s.charAt(i) == s.charAt(j) && solve(dp, i + 1, j - 1, s) == 1) {
            return dp[i][j] = 1;
        }
        return dp[i][j];
    }
    public String longestPalindrome(String s) {
         int n = s.length();
        int max_len = 0;
        int starting_index = 0;
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                solve(dp, i, j, s);
                if (dp[i][j] == 1) {
                    if (j - i + 1 > max_len) {
                        max_len = j - i + 1;
                        starting_index = i;
                    }
                }
            }
        }
        return s.substring(starting_index, starting_index + max_len);
    }
}