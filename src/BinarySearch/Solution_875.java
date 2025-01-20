package BinarySearch;

import java.util.Arrays;

public class Solution_875 {
        public int minEatingSpeed(int[] piles, int h) {
            int left = 1, right = Arrays.stream(piles).max().getAsInt();
            int speed = 0;
            int time = 0;

            while(left < right){
                speed = left + (right - left) / 2;

                for(int i = 0; i < piles.length && time <= h; i++){
                    time += (piles[i] + speed - 1) /speed;
                }

                if(time > h){
                    left = speed + 1;
                }else{
                    right = speed;
                }
                time = 0;
            }

            return left ;

        }

}
