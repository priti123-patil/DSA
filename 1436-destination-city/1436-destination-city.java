class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> city = new ArrayList<String>();
        for(List<String> s : paths){
            city.add(s.get(1));
        }
        for(List<String> s : paths){
            if(city.contains(s.get(0))){
                city.remove(s.get(0));
            }
        }
        return city.get(0);
    }
}