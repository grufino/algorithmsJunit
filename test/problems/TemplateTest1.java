package problems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TemplateTest1 {

    TemplateClass1 problemInstance;

    public void setUp() {
        problemInstance = new TemplateClass1();
    }

    @Test
    public void test1() {
        setUp();
        int n = 4;
        assertArrayEquals(new int[]{1,-1,2,-2}, problemInstance.solution(n));
    }

    @Test
    public void test2() {
        setUp();
        int n = 5;
        assertArrayEquals(new int[]{1,-1,2,-2,0}, problemInstance.solution(n));
    }

    @Test
    public void test3() {
        setUp();
        int n = 1;
        assertArrayEquals(new int[]{0}, problemInstance.solution(n));
    }
}
