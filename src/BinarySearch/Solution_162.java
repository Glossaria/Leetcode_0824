package BinarySearch;

public class Solution_162 {

    public int findPeakElement_1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return n - 1;
    }

    public int findPeakElement(int[] nums) {
        if (nums.length == 1)
            return 0;

        int right = nums.length - 1;
        int left = 0;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid + 1] < nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }

        return left;
    }

}
