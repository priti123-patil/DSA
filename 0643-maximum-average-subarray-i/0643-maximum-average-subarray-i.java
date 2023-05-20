class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        int sum = 0, max = Integer.MIN_VALUE;
        int i = 0,j = 0,n = nums.length;
        while(j < n) {
            sum += nums[j];
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                max = Math.max(max,sum);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return max/(double)k;
    }
}