class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        HashSet<Integer> used_frequencies = new HashSet<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int freq : map.values()) {
            while (freq > 0 && used_frequencies.contains(freq)) {
                freq--;
                ans++;
            }
            used_frequencies.add(freq);
        }
        
        return ans;
    }
}