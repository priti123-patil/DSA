/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int peak = peakIndexInMountainArray(mountainArr);
        int left = binarysearch_ascending(mountainArr,0,peak,target);
        int right = binarysearch_descending(mountainArr,peak+1,mountainArr.length()-1,target);
        
        int ans = 0;
        
        if(left < 0) {
            ans = right;
        }
        else if(right < 0) {
            ans = left;
        }
        else {
            ans = Math.min(left,right);
        }
        return ans;
    }
    
    static int peakIndexInMountainArray(MountainArray mountainArr) {
        int l = 0, h = mountainArr.length() - 1;
        int mid = 0;
        while(l < h) {
            mid = l + (h - l) / 2;
            if(mountainArr.get(mid)  >  mountainArr.get(mid+1)) {
                 h = mid;
            }
            else {
                l = mid + 1; 
            }
        }
        //returns peak element
        return h;
    }
    
    static int binarysearch_ascending(MountainArray mountainArr,int l,int h,int target) {
        int mid = 0;
        while(l <= h) {
            mid = l + (h-l) / 2;
            if(mountainArr.get(mid) == target) {
                 return mid;
            }
            else if(mountainArr.get(mid) < target) {
                l = mid+1; 
            }
            else {
                h = mid-1;
            }
        }
        return -1;
    }
    
    static int binarysearch_descending(MountainArray mountainArr,int l,int h,int target)
    {
       
        int mid = 0;
        while(l <= h) {
            mid = l + (h-l) / 2;
            if(mountainArr.get(mid)==target) {
                 return mid;
            }
            else if(mountainArr.get(mid)>target) {
                l = mid+1; 
            }
            else {
                h = mid-1;
            }
        }
        return -1;
    }
}