class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        // > success
        // product with second subarray
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        for(int i = 0; i < spells.length; i++){
            long minPotion = (long) Math.ceil((1.0 * success) / spells[i]);
            if(minPotion > potions[potions.length - 1]){
                ans[i] = 0;
                continue;
            }
            int firstPos = helper(potions , (int)minPotion);
            ans[i] = potions.length - firstPos;
        }
        return ans;
    }
    public int helper(int[] potions, int target){
        int l = 0; int h = potions.length;
        while(l < h){
            int mid = l + (h-l) / 2;
            if(potions[mid] < target){
                l = mid + 1;
            }
            else{
                h = mid;
            }
        }
        return l;
    }
}