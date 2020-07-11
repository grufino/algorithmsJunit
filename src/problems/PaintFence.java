package problems;

import java.util.Arrays;

public class PaintFence {
    public int numWays(int n, int k) {
        if(n == 0) return 0;
        if(k == 1 && n > 2) return 0;
        if(k == 1) return 1;
        int same = k;
        int diff = k-1;

        for(int i = 0; i < n; i++){
            int oldSame = same;
            same = same + k * (k-1);
            diff = oldSame;
        }

        return diff;
    }
}
