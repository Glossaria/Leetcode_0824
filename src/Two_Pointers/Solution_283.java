package Two_Pointers;

public class Solution_283 {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if (len <= 1) return;

        int slow = 0;
        int fast = 0;

        while (fast < len) {

            if (nums[fast] != 0) {
                fast++;
                slow++;
            } else {
                while (fast < len && nums[fast] == 0) {
                    fast++;
                }
                if (fast < len) {
                    nums[slow] = nums[fast];
                    nums[fast] = 0;
                    slow++;
                }
            }
        }
    }
}
