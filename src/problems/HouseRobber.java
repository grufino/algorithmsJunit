package problems;

import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+3];
        for(int i = nums.length-1; i >= 0; i--){
            dp[i] = nums[i] + Math.max(dp[i+3], dp[i+2]);
        }

        return Math.max(dp[0], dp[1]);
    }
}
