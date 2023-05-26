class Solution {
    public int longestSubarray(int[] nums) {
        int zero = 0;
        int ans = 0;
        int i = 0, j = 0;
        while(j < nums.length) {
            if(nums[j] == 0){
                zero += 1;
            }
            while (zero > 1) {
                if(nums[i] == 0){
                    zero -= 1;
                }
                i++;
            }
            ans = Math.max(ans, j - i);
            j++;
        }

        return ans;
    }
}