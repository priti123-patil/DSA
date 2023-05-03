class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i = 0; i < nums1.length ; i++){
            if(map1.containsKey(nums1[i])){
                map1.put(nums1[i] , map1.get(nums1[i]) + 1);
            } else {
                map1.put(nums1[i], 1);
            }
        }
        for(int j = 0; j < nums2.length ; j++){
            if(map2.containsKey(nums2[j])){
                map2.put(nums2[j] , map2.get(nums2[j]) + 1);
            } else {
                map2.put(nums2[j], 1);
            }
        }
        List<Integer> ans1 = new ArrayList<>();
        for(int n : map2.keySet()){
            if(!map1.containsKey(n)) {
                ans1.add(n);
            }
        }
        List<Integer> ans2 = new ArrayList<>();
        for(int n : map1.keySet()){
            if(!map2.containsKey(n)) {
                ans2.add(n);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(ans2);
        ans.add(ans1);
        return ans;
    }
}