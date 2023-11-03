class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int k = 0;
        for(int i : target){
            while(k < i - 1){
                res.add("Push");
                res.add("Pop");
                k++;
            }
            res.add("Push");
            k++;
        }
        return res;
    }
}