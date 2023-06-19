class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int ele = 0;
        for(int i = 0; i < gain.length; i++) {
            ele = ele + gain[i];
            max = Math.max(ele,max);
        }
        return max;
    }
}