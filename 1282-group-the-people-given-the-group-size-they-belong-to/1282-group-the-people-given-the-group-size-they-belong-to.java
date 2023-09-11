class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupSizes.length; i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i], new ArrayList<>());
            }    
            ArrayList<Integer> innerList = map.get(groupSizes[i]);
            innerList.add(i);
            
            if(innerList.size() == groupSizes[i]){
                ans.add(innerList);
                map.remove(groupSizes[i]);
            }
        }
        return ans;
    }
}