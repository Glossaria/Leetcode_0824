package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_2352 {
    // time(n^3), compare arrays
    public int equalPairs(int[][] grid) {
        int res = 0;
        int n = grid.length;
        for (int[] arr : grid) {
            int[] cur = Arrays.copyOf(arr, n);
            for (int j = 0, t = 0; j < n && t < n; ) {
                if (cur[t] == grid[t][j]) {
                    if (t == n - 1) {
                        res++;
                        t = 0;
                        j++;
                    }
                    t++;
                } else {
                    t = 0;
                    j++;
                }
            }
        }
        return res;
    }

    //hashmap
    public int equalPairs2(int[][] grid) {
        Map<String, Integer> mapRow = new HashMap<>();
        Map<String, Integer> mapCol = new HashMap<>();
        int res = 0;
        int n = grid.length;

        for (int[] item : grid) {
            StringBuilder key = new StringBuilder();
            for (int j = 0; j < n; j++) {
                key.append('.').append(String.valueOf(item[j]));
            }
            mapRow.put(key.toString(), (mapRow.getOrDefault(key.toString(), 0) + 1));
        }

        for(int i = 0; i < n; i++){
            StringBuilder key = new StringBuilder();
            for (int[] arr : grid) {
                key.append('.').append(String.valueOf(arr[i]));
            }
            mapCol.put(key.toString(),(mapCol.getOrDefault(key.toString(), 0) + 1) );
        }

        for(String key : mapRow.keySet()){
            res += mapRow.get(key) * mapCol.getOrDefault(key, 0);
        }

        return res;
    }

}
