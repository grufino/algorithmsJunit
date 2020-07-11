package problems;

import org.junit.Test;
import problems.PossibleBipartition;

import static org.junit.Assert.assertEquals;

public class PossibleBipartitionTest {
    @Test
    public void test1() {
        int[][] arr = new int[][]{{1,2},{1,3},{2,4}};
        int n = 4;
        boolean expected = true;
        assertEquals(PossibleBipartition.possibleBipartition(n, arr), expected);
    }

    @Test
    public void test2() {
        int[][] arr = new int[][]{{1,2},{1,3},{2,3}};
        int n = 3;
        boolean expected = false;
        assertEquals(PossibleBipartition.possibleBipartition(n, arr), expected);
    }

    @Test
    public void test3() {
        int[][] arr = new int[][]{{1,2},{2,3},{3,4},{4,5},{1,5}};
        int n = 5;
        boolean expected = false;
        assertEquals(PossibleBipartition.possibleBipartition(n, arr), expected);
    }
}
