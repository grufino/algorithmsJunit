package utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class InputParserTest {

    @Test
    public void SingleTest() {
        String input = "[1,2,3,4,5,6,7]";

        int[] expected = new int[]{1,2,3,4,5,6,7};

        assertArrayEquals(expected, InputParser.intArrfromString(input));
    }

    @Test
    public void Multiple2Test() {
        String input = "[[1,2,3],[4,5,6,7], [8,9,10]]";

        int[][] expected = new int[][]{{1,2,3},{4,5,6,7}, {8,9,10}};

        assertArrayEquals(expected, InputParser.intArrsfromString(input));
    }

    @Test
    public void Multiple3Test() {
        String input = "[[[1,2,3],[4,5,6,7], [8,9,10]]]";

        int[][] expected = new int[][]{{1,2,3},{4,5,6,7}, {8,9,10}};

        assertArrayEquals(expected, InputParser.intArrsfromString(input));
    }
}
