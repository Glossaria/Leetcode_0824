package Stack;

public class Solution_2390 {
    public String removeStars(String s) {
        int right = 0;
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        while(right < n){
            if(s.charAt(right) != '*'){
                sb.append(s.charAt(right));
            }else{
                sb.deleteCharAt(sb.length() - 1);
            }
            right++;
        }
        return sb.toString();
    }
}
