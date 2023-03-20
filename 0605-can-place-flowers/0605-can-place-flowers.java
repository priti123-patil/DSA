class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1 && flowerbed[0] == 0){
            return true;
        }
        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            if(n != 0){
                n -= 1;
            }
        }
        if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0){
            flowerbed[flowerbed.length-1] = 1;
            if(n != 0){
                n -= 1;
            }
        }
        //System.out.println(Arrays.toString(flowerbed));
        for(int i = 1;i < flowerbed.length-1;i++){
            if(flowerbed[i] == 0){
                System.out.println(n);
                if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    if(n != 0){
                        n -= 1;
                    }
                }
            }
        }
        return (n==0)?true:false; 
        //[1,0,0,0,1,0,1]
        // 0 1 2 3 4 5 6 
    }
}