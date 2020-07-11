package problems;

import org.junit.Test;
import problems.ShortestPathAlternatingColors;

import static org.junit.Assert.assertArrayEquals;

public class ShortestPathAlternatingColorsTest {
    ShortestPathAlternatingColors problemInstance;
    public void setUp() {
        problemInstance = new ShortestPathAlternatingColors();
    }


    @Test
    public void test1() {
        setUp();
        int[][] redArr = new int[][]{{0,1},{1,2}};
        int[][] blueArr = new int[][]{};
        int n = 3;

        int[] expected = new int[]{0,1,-1};
        assertArrayEquals(problemInstance.shortestAlternatingPaths(n, redArr, blueArr), expected);
    }

    @Test
    public void test2() {
        setUp();
        int[][] redArr = new int[][]{{0,1}};
        int[][] blueArr = new int[][]{{2,1}};
        int n = 3;

        int[] expected = new int[]{0,1,-1};
        assertArrayEquals(problemInstance.shortestAlternatingPaths(n, redArr, blueArr), expected);
    }

    @Test
    public void test3() {
        setUp();
        int[][] redArr = new int[][]{{1,0}};
        int[][] blueArr = new int[][]{{2,1}};
        int n = 3;

        int[] expected = new int[]{0,-1,-1};
        assertArrayEquals(problemInstance.shortestAlternatingPaths(n, redArr, blueArr), expected);
    }

    @Test
    public void test4() {
        setUp();
        int[][] redArr = new int[][]{{0,1}};
        int[][] blueArr = new int[][]{{1,2}};
        int n = 3;

        int[] expected = new int[]{0,1,2};
        assertArrayEquals(problemInstance.shortestAlternatingPaths(n, redArr, blueArr), expected);
    }

    @Test
    public void test5() {
        setUp();

        int[][] redArr = new int[][]{{0,1}, {0,2}};
        int[][] blueArr = new int[][]{{1,0}, {1,3}, {2,4}, {3,4}};
        int n = 5;

        int[] expected = new int[]{0,1,1,2,2};
        assertArrayEquals(problemInstance.shortestAlternatingPaths(n, redArr, blueArr), expected);
    }

    @Test
    public void test6() {
        setUp();

        int[][] redArr = new int[][]{{0,1}, {1,2}, {2,3}, {3,4}};
        int[][] blueArr = new int[][]{{1,2}, {2,3}, {3,1}};
        int n = 5;

        int[] expected = new int[]{0,1,2,3,7};
        assertArrayEquals(problemInstance.shortestAlternatingPaths(n, redArr, blueArr), expected);
    }

    @Test
    public void test7() {
        setUp();

        int[][] redArr = new int[][]{{2,2},{0,1},{0,3},{0,0},{0,4},{2,1},{2,0},{1,4},{3,4}};
        int[][] blueArr = new int[][]{{1,3},{0,0},{0,3},{4,2},{1,0}};
        int n = 5;

        int[] expected = new int[]{0,1,2,1,1};

        assertArrayEquals(problemInstance.shortestAlternatingPaths(n, redArr, blueArr), expected);
    }

    @Test
    public void test8() {
        setUp();

        int[][] redArr = new int[][]{{4,1},{3,5},{5,2},{1,4},{4,2},{0,0},{2,0},{1,1}};
        int[][] blueArr = new int[][]{{5,5},{5,0},{4,4},{0,3},{1,0}};
        int n = 6;

        int[] expected = new int[]{0,-1,4,1,-1,2};

        assertArrayEquals(problemInstance.shortestAlternatingPaths(n, redArr, blueArr), expected);
    }
}
