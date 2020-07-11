package problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IsSubsequenceTest {
    IsSubsequence problemInstance;

    public void setUp() {
        problemInstance = new IsSubsequence();
    }

    @Test
    public void test1(){
        setUp();
        String inputLeft = "abc";
        String inputRight = "ahbgdc";

        assertEquals(true, problemInstance.isSubsequence(inputLeft, inputRight));
    }

    @Test
    public void test2(){
        setUp();
        String inputLeft = "axc";
        String inputRight = "ahbgdc";

        assertEquals(false, problemInstance.isSubsequence(inputLeft, inputRight));
    }

    @Test
    public void test3(){
        setUp();
        String inputLeft = "b";
        String inputRight = "c";

        assertEquals(false, problemInstance.isSubsequence(inputLeft, inputRight));
    }

}
