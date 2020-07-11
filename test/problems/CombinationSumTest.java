package problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CombinationSumTest {
    CombinationSum problemInstance;

    public void setUp() {
        problemInstance = new CombinationSum();
    }


    @Test
    public void test1() {
        setUp();
        int[] input = new int[]{2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(7), Arrays.asList(2, 2, 3));
        assertEquals(expected, problemInstance.combinationSum(input, target));
    }

    @Test
    public void test2() {
        setUp();
        int[] input = new int[]{2, 3, 5};
        int target = 8;

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2,2,2,2), Arrays.asList(2, 3, 3), Arrays.asList(3,5));
        assertEquals(expected, problemInstance.combinationSum(input, target));
    }
}
