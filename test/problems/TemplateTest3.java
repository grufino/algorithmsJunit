package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemplateTest3 {

    TemplateClass3 problemInstance;

    public void setUp() {
        problemInstance = new TemplateClass3();
    }

    @Test
    public void test1() {
        int[][] arr = new int[][]{{1,2},{1,3},{2,4}};
        int n = 4;
        boolean expected = true;
        assertEquals(PossibleBipartition.possibleBipartition(n, arr), expected);
    }
}
