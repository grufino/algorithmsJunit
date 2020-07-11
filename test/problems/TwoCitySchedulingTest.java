package problems;

import org.junit.Test;
import problems.TwoCityScheduling;

import static org.junit.Assert.assertEquals;

public class TwoCitySchedulingTest {
    TwoCityScheduling problemInstance;

    public void setUp() {
        problemInstance = new TwoCityScheduling();
    }


    @Test
    public void test1() {
        setUp();
        int[][] costs = new int[][]{{400, 50}, {400, 50}, {400, 50},{400, 50}, {400, 50}, {400, 50}};

        int expected = 1350;
        assertEquals(expected, problemInstance.twoCitySchedCost(costs));
    }

    @Test
    public void test2() {
        setUp();
        int[][] costs = new int[][]{{10,20},{30,200},{400,50},{30,20}};

        int expected = 110;
        assertEquals(expected, problemInstance.twoCitySchedCost(costs));
    }
    @Test
    public void test3() {
        setUp();
        int[][] costs = new int[][]{};

        int expected = 0;
        assertEquals(expected, problemInstance.twoCitySchedCost(costs));
    }

    @Test
    public void test4() {
        setUp();
        int[][] costs = new int[][]{{10, 20}, {30, 200}, {400, 50},{30, 20}, {400, 50}, {400, 50}};

        int expected = 220;
        assertEquals(expected, problemInstance.twoCitySchedCost(costs));
    }
}