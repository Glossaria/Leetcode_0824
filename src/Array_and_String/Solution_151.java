package Array_and_String;

import java.util.Objects;

public class Solution_151 {
     public String reverseWords(String s) {
            String[] array = s.split(" ");
            int len = array.length;

            StringBuilder res = new StringBuilder();

            for(int i = len - 1; i >= 0; i--){
                if(!Objects.equals(array[i], "")){
                    res.append(array[i]);
                    res.append(" ");
                }
            }
            res.setLength(Math.max(res.length() - 1, 0));
            return res.toString();
     }
}
