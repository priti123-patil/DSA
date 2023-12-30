class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(String word : words) {
            for(Character c : word.toCharArray()) {
                if(map.containsKey(c)) {
                    map.put(c,map.getOrDefault(c,0)+1);    
                }
                else {
                    map.put(c,1);
                }
            }
        }
        for(Character c : map.keySet()){
            int val = map.get(c);
            if(val % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}