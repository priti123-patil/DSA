class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i = 1; i <= n; i++){
            String s = Integer.toBinaryString(i);
            ans[i] = getOnesCount(s);
        }
        return ans;
    }
    
    public static int getOnesCount(String s){
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                cnt++;
            }
        }
        return cnt;
    }
}