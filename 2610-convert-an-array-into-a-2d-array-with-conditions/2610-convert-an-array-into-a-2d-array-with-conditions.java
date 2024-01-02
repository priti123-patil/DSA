class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] cnt = new int[nums.length + 1];
        List<List<Integer>> ans = new ArrayList<>();
        for(int n : nums){
            if(cnt[n] >= ans.size()){
                ans.add(new ArrayList<>());
            }
            ans.get(cnt[n]).add(n);
            cnt[n]++;
        }
        return ans;
    }
}