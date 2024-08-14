public class Solution_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int len = flowerbed.length;
        if(n == 0) return true;
        if(len == 1 && n <= 1) return flowerbed[0] != 1;

        for(int i = 0; i < len; i++){
            if(n == 0) return true;

            if(i <= 1 && flowerbed[0] == 0 && flowerbed[1] == 0){
                flowerbed[0] = 1;
                n--;
            }

            if(n >= 1
                    && flowerbed[i] == 0
                    && i - 1 >= 0 && flowerbed[i - 1] == 0
                    && i + 1 < len && flowerbed[i + 1] == 0){

                flowerbed[i] = 1;
                n--;
            }
        }
        if(flowerbed[len - 2] == 0 && flowerbed[len - 1] == 0) n--;
        return n == 0;
    }
}
