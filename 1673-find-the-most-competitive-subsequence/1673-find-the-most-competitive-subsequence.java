class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);
        int n = nums.length;
        for(int i = 1;i < nums.length; i++){
            while(!st.isEmpty() && st.peek() > nums[i] && n-i-1 >= k - st.size()){
                st.pop();   
            }
            st.push(nums[i]);
        }
        int[] res = new int[k];
        while(st.size() > k) {
            st.pop();
        }
        k = k-1;
        while(k != -1 ) {
            res[k] = st.pop();
            k--;
        }
        return res;
    }
}