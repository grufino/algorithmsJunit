package problems;

import org.junit.Test;
import utils.InputParser;

import static org.junit.Assert.assertArrayEquals;

public class QueueReconstructionByHeightTest {
    QueueReconstructionByHeight problemInstance;
    public void setUp() {
        problemInstance = new QueueReconstructionByHeight();
    }

    @Test
    public void test1() {
        setUp();
        int[][] input = InputParser.intArrsfromString("[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]");
        int[][] expected = InputParser.intArrsfromString("[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]");

        assertArrayEquals(problemInstance.reconstructQueue(input), expected);
    }
}
