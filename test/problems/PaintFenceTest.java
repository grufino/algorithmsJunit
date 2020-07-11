package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaintFenceTest {
    PaintFence problemInstance;

    public void setUp() {
        problemInstance = new PaintFence();
    }


    @Test
    public void test1() {
        setUp();
        int n = 3;
        int k = 2;
        int expected = 6;

        assertEquals(expected, problemInstance.numWays(n, k));
    }

    @Test
    public void test2() {
        setUp();
        int n = 2;
        int k = 1;
        int expected = 1;

        assertEquals(expected, problemInstance.numWays(n, k));
    }

    @Test
    public void test3() {
        setUp();
        int n = 2;
        int k = 2;
        int expected = 4;

        assertEquals(expected, problemInstance.numWays(n, k));
    }

    @Test
    public void test4() {
        setUp();
        int n = 3;
        int k = 1;
        int expected = 0;

        assertEquals(expected, problemInstance.numWays(n, k));
    }

    @Test
    public void test5() {
        setUp();
        int n = 0;
        int k = 0;
        int expected = 0;

        assertEquals(expected, problemInstance.numWays(n, k));
    }
    @Test
    public void test6() {
        setUp();
        int n = 0;
        int k = 1;
        int expected = 0;

        assertEquals(expected, problemInstance.numWays(n, k));
    }
}
