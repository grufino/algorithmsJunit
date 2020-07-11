package problems;

import org.junit.Test;
import utils.InputParser;

import static org.junit.Assert.assertEquals;

public class MinimumCostsForTicketTest {
    MinimumCostsForTicket problemInstance;

    public void setUp() {
        problemInstance = new MinimumCostsForTicket();
    }

    @Test
    public void test1() {
        setUp();
        int[] days = InputParser.intArrfromString("[1,4,6,7,8,20]");
        int[] costs = InputParser.intArrfromString("[2,7,15]");
        int expected = 11;

        assertEquals(expected, problemInstance.mincostTickets(days, costs));
    }

    @Test
    public void test2() {
        setUp();
        int[] days = InputParser.intArrfromString("[1,2,3,4,5,6,7,8,9,10,30,31]");
        int[] costs = InputParser.intArrfromString("[2,7,15]");
        int expected = 17;

        assertEquals(expected, problemInstance.mincostTickets(days, costs));
    }
}
