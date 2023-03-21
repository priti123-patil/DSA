class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum =0 , count = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] == 0)
            {
                sum += 1;
                if(nums[i+1] == 0)
                    count += 1;
                else
                    count = 0;
            }
            sum += count;
        }
        return (nums[nums.length-1]==0)?sum+=1:sum;
    }
}