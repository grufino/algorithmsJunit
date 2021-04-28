package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemplateTest2 {

    TemplateClass2 problemInstance;

    public void setUp() {
        problemInstance = new TemplateClass2();
    }

    @Test
    public void test1() {
        setUp();
        assertEquals(problemInstance.solution("CBACD"), "A");
    }

    @Test
    public void test2() {
        setUp();
        assertEquals(problemInstance.solution("CABABD"), "");
    }
}
