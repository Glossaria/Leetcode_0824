package BinarySearch;

public class Solution_374 {

    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if mid is higher than the picked number
     * 1 if number is lower than the picked number
     * otherwise return 0
     * int guess(int number);
     */
    public static int pick;

    public int guess(int n){
        return Integer.compare(n, pick);
    }

    public int guessmidber(int n) {
        if (guess(n) == 0) return n;
        int left = 0;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (guess(mid) == 1) {
                left = mid;
                mid = mid + (right - mid) / 2;
            } else if (guess(mid) == -1) {
                right = mid;
                mid = (mid - left) / 2;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

