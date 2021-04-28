package problems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SmallPosIntTest {
    SmallPosInt problemInstance;

    public void setUp() {
        problemInstance = new SmallPosInt();
    }

    @Test
    public void test1() {
        setUp();
        int[] a = new int[]{1,3,6,4,1,2};

        assertEquals (5,problemInstance.solution(a));
    }

    @Test
    public void test2() {
        setUp();
        int[] a = new int[]{-1,-3};

        assertEquals (1, problemInstance.solution(a));
    }

    @Test
    public void test3() {
        setUp();
        int[] a = new int[]{1,2,3};

        assertEquals (4, problemInstance.solution(a));
    }
}
