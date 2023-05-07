class Solution {
    List<Integer> res;
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length;
        int size = 0;
        int[] res = new int[n], lis = new int[n];
        for (int i = 0; i < n; ++i) {
            int height = obstacles[i];          
            int idx = bisectRight(lis, height, size);
            if (idx == size)
                size++;
            lis[idx] = height;
            res[i] = idx + 1;
        }
        return res;  
    }
    public int bisectRight(int[] arr, int target, int right) {
        if (right == 0)
            return 0;
        int left = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}