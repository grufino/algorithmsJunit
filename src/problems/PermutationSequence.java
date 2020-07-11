package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class PermutationSequence {
    HashSet<Integer> visited;
    int k;
    int c;
    String ans;
    public String getPermutation(int n, int k) {
        ans = "";
        c = 0;
        this.k = k;
        visited = new HashSet<>();
        char[] nums = new char[n];
        for(int i = 1; i <= n; i++){
            nums[i-1] = Character.forDigit(i,10);
        }

        helper(nums, new ArrayList<>());

        return ans;
    }

    public boolean helper(char[] nums, ArrayList<Character> partial){

        if (partial.size() == nums.length) {
            c++;
            if(c == k){
                ans = getStringRepresentation(partial);
                return true;
            }
            return false;
        }

        for(int i = 0; i < nums.length; i++){
            if(visited.contains(i)) continue;
            visited.add(i);
            partial.add(nums[i]);
            if(helper(nums, partial)){
                return true;
            };
            visited.remove(i);
            partial.remove(partial.size()-1);
            // only necessary if excluding repeated:
            while(i < nums.length-1 && nums[i] == nums[i+1]){
                i++;
            }
        }
        return false;
    }

    String getStringRepresentation(ArrayList<Character> list) {
        StringBuilder builder = new StringBuilder(list.size());
        for(Character ch: list)
        {
            builder.append(ch);
        }
        return builder.toString();
    }
}
