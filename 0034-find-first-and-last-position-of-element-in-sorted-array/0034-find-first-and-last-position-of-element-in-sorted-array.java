class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        
        int s = search(nums,target,true);
        int e = search(nums,target,false);
        
        return new int[]{s,e};
    }
    
    static int search(int[] nums, int target , boolean findfirstIndex) {
        int l = 0, h = nums.length-1;
        int mid = 0, ans = -1;
        while(l <= h) {
            mid = l + (h-l) / 2;
            if(nums[mid] < target) {
                l = mid + 1;
            }
            else if(nums[mid] > target) {
                h = mid - 1;
            }
            else {
                ans = mid;
                if(findfirstIndex) {
                    h = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
        }
        return ans;
    }
}