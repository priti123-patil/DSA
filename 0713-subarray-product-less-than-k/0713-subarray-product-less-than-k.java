class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int i = 0, j = 0,cnt = 0;
        long product = 1;
        while(j < nums.length) {
            product = product * nums[j];
            while(product >= k) {
                product /= nums[i++];
            }
            cnt += j-i+1;
            j++;
        }
        return cnt;
    }
}