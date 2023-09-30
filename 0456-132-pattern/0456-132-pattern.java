class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int third = Integer.MIN_VALUE;
        for(int i = nums.length-1; i >= 0; i--) {
            if(nums[i] < third) {
                return true; //Checking for first value
            }
            while(!st.isEmpty() && nums[i] > st.peek()) {
                third = st.pop(); //find out peak ele and set the third as st.peek
            }
            st.push(nums[i]); //Push peak ele into stack
        }
        return false;
    }
}