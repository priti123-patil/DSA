class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        if(houses == null || heaters == null)
            return Integer.MAX_VALUE;
        Arrays.sort(heaters);
        int result = Integer.MIN_VALUE;
        for(int house : houses){
            int rad = findRad(house, heaters);
            result = Math.max(rad, result);
        }
        return result;
    }
    
    private int findRad(int house, int[] heaters){
        int start = 0, end = heaters.length-1;
        int left = Integer.MAX_VALUE , right = Integer.MAX_VALUE ;
        while(start <= end){
            int mid = (start + end)/2;
            int heater = heaters[mid];
            if(heater == house)
                return 0;
            else if(heater > house){
                right = heater - house;
                end = mid - 1;
            } else{
                left = house - heater;
                start = mid + 1;
            }
        }
        return  Math.min(left, right);
    }
}