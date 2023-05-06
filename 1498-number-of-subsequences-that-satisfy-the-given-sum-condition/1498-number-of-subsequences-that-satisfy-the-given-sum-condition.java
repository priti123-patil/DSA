class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1_000_000_007;
        int[] power = new int[nums.length];
        power[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        int ans = 0;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                ans += power[r - l];
                ans %= mod;
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}