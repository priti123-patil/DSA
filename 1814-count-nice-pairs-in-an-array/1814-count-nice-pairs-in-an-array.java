class Solution {
    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int ans = 0;
        int MOD = (int) 1e9 + 7;
        for (int i = 0; i < nums.length; i++) {
            int diff = nums[i] - rev(nums[i]), freq = map.getOrDefault(diff, 0);
            ans = (ans + freq) % MOD;
            map.put(diff, freq + 1);
        }
        return ans;
    }

    public int rev(int num) {
        int result = 0;
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}