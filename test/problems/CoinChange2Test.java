package problems;

import org.junit.Test;
import utils.InputParser;

import static org.junit.Assert.assertEquals;

public class CoinChange2Test {
    CoinChange2 problemInstance;

    public void setUp() {
        problemInstance = new CoinChange2();
    }

    @Test
    public void test1() {
        setUp();
        int[] input = InputParser.intArrfromString("[2]");
        int target = 3;
        int expected = 0;

        assertEquals(expected, problemInstance.change(target, input));
    }

    @Test
    public void test2() {
        setUp();
        int[] input = InputParser.intArrfromString("[10]");
        int target = 10;
        int expected = 1;

        assertEquals(expected, problemInstance.change(target, input));
    }

    @Test
    public void test3() {
        setUp();
        int[] input = InputParser.intArrfromString("[2]");
        int target = 6;
        int expected = 4;

        assertEquals(expected, problemInstance.change(target, input));
    }
}
