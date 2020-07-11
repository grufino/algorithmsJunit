package problems;

import org.junit.Test;
import utils.InputParser;

import static org.junit.Assert.assertEquals;

public class HouseRobberTest {

    HouseRobber problemInstance;

    public void setUp() {
        problemInstance = new HouseRobber();
    }


    @Test
    public void test1() {
        setUp();
        int expected = 0;

        assertEquals(expected, problemInstance.rob(new int[]{}));
    }

    @Test
    public void test2() {
        setUp();
        int[] input = InputParser.intArrfromString("[1,2,3,1]");
        int expected = 4;

        assertEquals(expected, problemInstance.rob(input));
    }

    @Test
    public void test3() {
        setUp();
        int[] input = InputParser.intArrfromString("[2,7,9,3,1]");
        int expected = 12;

        assertEquals(expected, problemInstance.rob(input));
    }

    @Test
    public void test4() {
        setUp();
        int[] input = InputParser.intArrfromString("[1]");
        int expected = 1;

        assertEquals(expected, problemInstance.rob(input));
    }

    @Test
    public void test5() {
        setUp();
        int[] input = InputParser.intArrfromString("[1,2]");
        int expected = 2;

        assertEquals(expected, problemInstance.rob(input));
    }

    @Test
    public void test6() {
        setUp();
        int[] input = InputParser.intArrfromString("[2,1,1,2]");
        int expected = 4;

        assertEquals(expected, problemInstance.rob(input));
    }

    @Test
    public void test7() {
        setUp();
        int[] input = InputParser.intArrfromString("[400,1,1,1,1,400]");
        int expected = 801;

        assertEquals(expected, problemInstance.rob(input));
    }
}
