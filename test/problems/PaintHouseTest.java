package problems;

import org.junit.Test;
import utils.InputParser;

import static org.junit.Assert.assertEquals;

public class PaintHouseTest {
    PaintHouse problemInstance;

    public void setUp() {
        problemInstance = new PaintHouse();
    }

    @Test
    public void test1() {
        setUp();
        int[][] input = InputParser.intArrsfromString("[[17,2,17],[16,16,5],[14,3,19]]");
        int expected = 10;

        assertEquals(expected, problemInstance.minCost(input));
    }

    @Test
    public void test2() {
        setUp();
        int[][] input = InputParser.intArrsfromString("[[17,2,17],[17,1,17],[14,3,19]]");
        int expected = 2+17+3;

        assertEquals(expected, problemInstance.minCost(input));
    }
}
