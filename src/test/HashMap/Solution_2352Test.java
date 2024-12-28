package test.HashMap;

import HashMap.Solution_2352;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_2352Test {

    int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
    int[][] grid2 = {{10,10,10},{14,10,10},{10,10,10}};
    int[][] grid3 ={{3,2,1},{1,7,6},{2,7,7}};
    @Test
    public void equalPairs() {
        int res = new Solution_2352().equalPairs(grid);
        assertEquals(3, res);
    }

    @Test
    public void equalPairs2() {

        int res = new Solution_2352().equalPairs2(grid);
        assertEquals(3, res);
        assertEquals(1, new Solution_2352().equalPairs2(grid3));
        assertEquals(4, new Solution_2352().equalPairs2(grid2));
    }
}