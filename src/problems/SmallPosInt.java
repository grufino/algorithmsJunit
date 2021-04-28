package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class SmallPosInt {

    public int solution(int[] A) {
        if (A.length == 0) return 1;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Iterator<Integer> it = Arrays.stream(A).iterator();
        it.forEachRemaining((a) -> {
            if(a > 0) pq.add(a);
        });

        int result = 0;
       while(!pq.isEmpty()){
           int a = pq.poll();

           if(a > result){
               int diff = Math.abs(a - result);
               if(diff == 1){
                   result = a;
               } else return result+1;
           }
        };

        return result+1;

    }
}
