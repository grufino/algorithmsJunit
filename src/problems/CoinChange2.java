package problems;

import java.util.Arrays;

/*
    Dynamic programming, storage type:
    - Array storing the maximum possibilites with the current coin to reach a desired result,
    accumulating incrementally as we pass through the same coins as the maximum possible answer each time you increment.

     Sub-problem:
     - Accumulate the current count with the previously found result for that coin, example:
     when I want to get to desired result of 1, I can use the one coin, so that's where my iteration will start,
     for the result 1 with coin 1, we just add the total amount of results we already have that are possible,
     and should be stored in the position 1 - 1 in our dp array. Similarly for result 2 with coin 1, we will get all possibilites
     considered in 2 - 1, which will be directly the result we generated before.

     Considerations:
     With this approach we can guarantee that we won't get invalid results for 2 reasons:
     - we are skipping impossible results with a particular coin, since we start the amount iteration from the coin value
     - we are always getting pre-computed values to fill the DP, generated based on the assumption that we can get to a particular amount,
     so for example if we have only coin 2 and want to get to any odd number, the result will always be 0 because we skipped 1 when starting
     our amount iteration from 2, and then when we try to get 3, it will copy the value from 3 - 2, which is 1, which we skipped and therefore
     contains 0, and so on...
 */
public class CoinChange2 {

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int j = 0; j < coins.length; j++) {
            for (int i = coins[j]; i <= amount; i++) {
                System.out.println(Arrays.toString(dp));
                dp[i] += dp[i - coins[j]];
            }
        }
        System.out.println(Arrays.toString(dp));

        return dp[amount];
    }
}
