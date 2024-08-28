package Array_and_String;

public class Solution_443 {
    public int compress(char[] chars) {
        int len = chars.length;
        int cur_idx = 0;

        for (int i = 0; i < len; ) {
            char cur = chars[i];
            int counter = 0;

            while (i < len && chars[i] == cur) {
                counter++;
                i++;
            }

            chars[cur_idx++] = cur;
            if (counter > 1) {
                char[] temp = String.valueOf(counter).toCharArray();
                for (char c : temp) {
                    chars[cur_idx++] = c;
                }
            }
        }
        return cur_idx;
    }

}
