class Solution {
    public int minDeletions(String s) {
        int[] charCount = new int[26];
        for(char ch : s.toCharArray()){
            charCount[ ch - 'a'] ++;
        }
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int val : charCount){
            while(val !=0 && set.contains(val)){
                val--;
                ans++;
            }
            set.add(val);          
        }
        return ans;
    }
}