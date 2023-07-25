class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, h = arr.length-1;
        int mid = 0;
        if(arr.length == 1) {
            return 0;
        }
        while(l < h) {
            mid = l + (h-l) / 2;
            if(arr[mid] > arr[mid+1]) {
                h=mid;
            } else {
                l = mid+1; 
            }
        }
        return l;
    }
}