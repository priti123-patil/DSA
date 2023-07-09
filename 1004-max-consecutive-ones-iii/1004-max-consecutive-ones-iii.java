class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, ans = 0, flip = 0;
        while(j < nums.length)
        {
            if(nums[j] == 0){
               flip++;
            }
            while(flip > k)
            {
                if(nums[i] == 0){
                    flip--;
                }
                i++;
            }
           ans = Math.max(ans, j-i+1);
           j++; 
        }
        return ans;
    }
}