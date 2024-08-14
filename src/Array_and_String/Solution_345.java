package Array_and_String;

import java.util.ArrayList;
import java.util.List;

public class Solution_345 {
    public String reverseVowels(String s) {
        String vowel = "aeiouAEIOU";
        int len = s.length();
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < len; i++){
            if(vowel.indexOf(s.charAt(i)) != -1){
                list.add(s.charAt(i));
            }
        }

        int j = list.size() - 1;
        char[] res = s.toCharArray();

        for(int i = 0; i < len; i++){
            if(vowel.indexOf(s.charAt(i)) != -1){
                res[i] = list.get(j--);
            }else{
                res[i] = s.charAt(i);
            }
        }
        return String.valueOf(res);
    }
}
