class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0;i < nums1.length; i++){
            Stack<Integer> stack = new Stack<>();
            for (int j = nums2.length-1 ; j >= 0; j--) {
                stack.push(nums2[j]);
            }
            while(nums1[i] != stack.peek()){
                stack.pop();
            }
            stack.pop();
            while(!stack.isEmpty()){
                if(stack.peek() > nums1[i]){
                    ans[i] = stack.pop();
                    break;
                }
                else{
                    stack.pop();
                }
            }
            if(stack.isEmpty() && ans[i] == 0){
                ans[i] = -1;
            }
        }
        return ans;
    }
}