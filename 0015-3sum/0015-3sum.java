class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3){
            return res;
        }
        Arrays.sort(nums);
        if(nums[0] > 0){
            return res;
        }
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int low = i+1, high = nums.length-1;
            while(low < high){
                int sum = nums[low] + nums[high] + nums[i];
                if(sum == 0){
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[low]);
                    ans.add(nums[high]);
                    res.add(ans);
                    int last_low = nums[low], last_high = nums[high];
                    while(low < high && nums[low] == last_low){
                        low++;
                    }
                    while(low < high && nums[high] == last_high){
                        high--;
                    }
                }
                else if(sum < 0){
                    low++;
                }
                else if(sum > 0){
                    high--;
                }
            }
        }
        return res;
    }
}