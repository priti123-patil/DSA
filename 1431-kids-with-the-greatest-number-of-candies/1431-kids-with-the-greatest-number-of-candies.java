class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        
        //Use greedy approach
        //For each kid check if candies[i] + extraCandies ≥ maximum in Candies[i]
        int max=candies[0];
        ArrayList<Boolean> res=new ArrayList<Boolean>();
        for(int i = 0;i < candies.length; i++) {
            if(candies[i] > max)
                max = candies[i];   
        }
        for(int i = 0;i < candies.length; i++) {
            if(candies[i] + extraCandies  >= max)
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }
}