package problems;

import org.junit.Test;
import utils.InputParser;

import static org.junit.Assert.assertEquals;

public class MinCostClimbingStairsTest {
    MinCostClimbingStairs problemInstance;

    public void setUp() {
        problemInstance = new MinCostClimbingStairs();
    }

    @Test
    public void test1() {
        setUp();
        int[] input = InputParser.intArrfromString("[10, 15, 20]");
        int expected = 15;

        assertEquals(expected, problemInstance.minCostClimbingStairs(input));
    }

    @Test
    public void test2() {
        setUp();
        int[] input = InputParser.intArrfromString("[1, 100, 1, 1, 1, 100, 1, 1, 100, 1]");
        int expected = 6;

        assertEquals(expected, problemInstance.minCostClimbingStairs(input));
    }
}
