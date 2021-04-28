package problems;

import java.util.Arrays;

public class TemplateClass1 {

    TemplateClass1 problemInstance;

    public int[] solution(int N) {
        int cur = 1;
        int[] result = new int[N];
        for(int i = 0; i < N; i++){
            if(i % 2 == 0){
                result[i] = cur;
            } else {
                result[i] = cur * -1;
                cur++;
            }
        }

        if(N % 2 > 0){
            result[N-1] = 0;
        }

        return result;
    }
}
