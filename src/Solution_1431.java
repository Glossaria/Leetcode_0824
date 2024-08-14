import java.util.ArrayList;
import java.util.List;

public class Solution_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> res = new ArrayList<>();
        for (int candy : candies) {
            res.add(candy + extraCandies >= max);
        }

        return res;
    }

}

