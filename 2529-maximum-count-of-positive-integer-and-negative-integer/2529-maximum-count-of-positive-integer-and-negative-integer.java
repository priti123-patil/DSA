class Solution {
    public int maximumCount(int[] nums) {
        int i = 0;
        int cnt = 0;
        for(i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                cnt++;
            }
            if(nums[i] > 0){
                break;
            }
        }
        return Math.max(i-cnt, nums.length-i);
    }
}