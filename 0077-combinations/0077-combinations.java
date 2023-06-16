class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (k > n || k < 0) {
            return ans;
        }
        if (k == 0) {
            ans.add(new ArrayList<Integer>());
            return ans;
        }
        ans = combine(n - 1, k - 1);
        for (List<Integer> list : ans) {
            list.add(n);
        }
        ans.addAll(combine(n - 1, k));
        return ans;
    }
}