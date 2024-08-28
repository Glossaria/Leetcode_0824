package Array_and_String;

public class Solution_238 {
        public int[] productExceptSelf(int[] nums) {
            int len = nums.length;
            int[] pre = new int[len];
            int[] post = new int[len];

            pre[0] = 1;
            post[len - 1] = 1;

            for(int i = 1, j = len - 2; i< len && j >= 0; i++, j--){
                pre[i] = pre[i - 1] * nums[i - 1];
                post[j] = post[j + 1] * nums[j + 1];
            }

            for( int i = 0; i < len; i++){
                nums[i] = pre[i] * post[i];
            }

            return nums;
        }
}
