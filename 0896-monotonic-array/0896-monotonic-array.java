class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums[0] < nums[nums.length-1]){
            for(int i = 0, j = 1; i < nums.length-1; i++){
                if(nums[i] > nums[j]) {
                    return false;
                }
                j++;
            }
        }
        else {
            for(int i = 0, j = 1; i < nums.length-1; i++){
                if(nums[i] < nums[j]) {
                    return false;
                }
                j++;
            }
        }
        return true;
    }
}