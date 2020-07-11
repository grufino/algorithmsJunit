package problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermutationSequenceTest {
    PermutationSequence problemInstance;

    public void setUp() {
        problemInstance = new PermutationSequence();
    }

    @Test
    public void test1(){
        setUp();

        String expected = "2314";

        assertEquals(expected, problemInstance.getPermutation(4,9));
    }

    @Test
    public void test2(){
        setUp();

        String expected = "213";

        assertEquals(expected, problemInstance.getPermutation(3,3));
    }

    @Test
    public void test3(){
        setUp();

        String expected = "591473826";

        assertEquals(expected, problemInstance.getPermutation(9,196883));
    }
}
