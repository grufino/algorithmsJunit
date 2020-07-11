package problems;

import org.junit.Test;
import utils.InputParser;

import static org.junit.Assert.assertEquals;

public class BuySellStockTest {
    BuySellStock problemInstance;

    public void setUp() {
        problemInstance = new BuySellStock();
    }

    @Test
    public void test1() {
        setUp();
        int[] input = InputParser.intArrfromString("[7,1,5,3,6,4]");
        int expected = 7;

        assertEquals(expected, problemInstance.maxProfit(input));
    }

    @Test
    public void test2() {
        setUp();
        int[] input = InputParser.intArrfromString("[1,2,3,4,5]");
        int expected = 4;

        assertEquals(expected, problemInstance.maxProfit(input));
    }

    @Test
    public void test3() {
        setUp();
        int[] input = InputParser.intArrfromString("[7,6,4,3,1]");
        int expected = 0;

        assertEquals(expected, problemInstance.maxProfit(input));
    }
}
