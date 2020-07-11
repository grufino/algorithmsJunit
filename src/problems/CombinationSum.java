package problems;

import java.util.*;

public class CombinationSum {
    ArrayList<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        ans = new ArrayList<>();
        helper(candidates, new ArrayList<>(), target, 0);
        return ans;
    }

    public void helper(int[] candidates, ArrayList<Integer> result, int remain, int start){
        System.out.println(result);
        if(remain == 0){
            ArrayList<Integer> pAns = new ArrayList<>(result);
            ans.add(pAns);
        } else if(remain < -10){
            return;
        }

        for(int j = start; j < candidates.length; j++){
            result.add(candidates[j]);
            helper(candidates, result, remain - candidates[j], j);
            result.remove(result.size() - 1);
        }
    }
}
