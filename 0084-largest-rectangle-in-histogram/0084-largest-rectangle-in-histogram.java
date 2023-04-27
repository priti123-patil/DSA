class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        st.push(0);
        for(int i = 1; i < heights.length; i++) {
            while(!st.isEmpty() && heights[i] < heights[st.peek()]) {
                max = getMax(st, heights, max, i);
            }
            st.push(i);
        }
        int i = heights.length;
        while(!st.isEmpty()) {
            max = getMax(st, heights, max, i);
        }
        return max;
    }
    
    public int getMax(Stack<Integer> st, int[] heights, int max, int i) {
        int area = 0;
        int largest = st.pop();
        if(st.isEmpty()) {
            area = heights[largest] * i ;
        } else {
            area = heights[largest] * (i-1 - st.peek());
        }
        return Math.max(area,max);
    }
}

