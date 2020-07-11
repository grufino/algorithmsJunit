package problems;
import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {


    public int twoCitySchedCost(int[][] costs) {
        Comparator<int[]> arrComparator = (s1, s2) -> {
            return (s1[0] - s1[1]) - (s2[0] - s2[1]);
        };
        Arrays.sort(costs, arrComparator);

        int nBy2 = costs.length / 2;
        int ans = 0;
        for(int i = 0; i < costs.length; i++){
            if(i < nBy2){
                ans += costs[i][0];
            } else {
                ans += costs[i][1];
            }
        }
        return ans;
    }
}
