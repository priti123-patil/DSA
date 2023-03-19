class Solution {
    public String removeDigit(String number, char digit) {
        int n = number.length();
        String ans = "";
        for(int i = 0; i < n; i++){
            if(number.charAt(i) == digit){
                String s = number.substring(0,i) + number.substring(i+1);
                if(s.compareTo(ans) > 0) {
                    ans = s;
                }
            }      
        }
        
        return ans;
    }
}