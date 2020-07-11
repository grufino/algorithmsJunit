package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HammingDistanceTest {

    HammingDistance problemInstance;

    public void setUp() {
        problemInstance = new HammingDistance();
    }


    @Test
    public void test1() {
        setUp();
        int x = 1;
        int y = 4;
        int expected = 2;

        assertEquals(expected, problemInstance.hammingDistance(x, y));
    }
}
