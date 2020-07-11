package problems;

import java.util.Arrays;

public class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {

        System.out.println(Arrays.deepToString(people));

//        Object[] test = Arrays.stream(people).map(a -> a[0] - a[1]).toArray();
        Arrays.sort(people, (a,b) -> Integer.compare(b[0], a[0]));
        System.out.println(Arrays.deepToString(people));

        int[][] ans = new int[people.length][2];

        for(int i = 0; i < people.length; i++){
            ans[i] = new int[]{people[i][1], people[i][0]};
        }

        System.out.println(Arrays.deepToString(ans));

        return ans;
    }
}
