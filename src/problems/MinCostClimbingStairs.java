package problems;


import java.util.Arrays;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCosts = new int[cost.length+2];

        for(int i = 0; i < cost.length; i++){
            minCosts[i] = Math.min(cost[i] + minCosts[minCosts.length - i -1], cost[i] + minCosts[minCosts.length - i - 2]);
            System.out.println(Arrays.toString(minCosts));
        }

        return Math.min(minCosts[0], minCosts[1]);
    }
}
