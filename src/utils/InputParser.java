package utils;

import java.util.ArrayList;
import java.util.Arrays;

public class InputParser {
    public static int[] intArrfromString(String input) {
        String[] test = input.replace("[", "").replace("]", "").replaceAll("\\s+", "").split(",");
        Object[] objs = Arrays.stream(test)
                .map(a -> Integer.parseInt(a))
                .toArray();

        int[] result = new int[objs.length];

        for (int i = 0; i < objs.length; i++) {
            result[i] = (int) objs[i];
        }
        return result;
    }

    public static int[][] intArrsfromString(String input) {

        String a = input.replaceAll("\\s+", "");
        String[] test = a.substring(1, a.length() - 1).split(",");

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        ArrayList<Integer> partial = new ArrayList<>();
        for (int i = 0; i < test.length; i++) {
            String str = test[i];
            if (str.contains("[")) {
                partial = new ArrayList<>();
                str = str.substring(1);
            }

            if (str.contains("]")) {
                result.add(partial);
                str = str.substring(0, str.length() - 1);
            }
            Integer newInt = new Integer(str);
            partial.add(newInt);
        }

        int[][] ans = result
                .stream()
                .map(u -> {
                    int[] r = new int[u.size()];
                    for (int i = 0; i < u.size(); i++) {
                        r[i] = u.get(i);
                    }
                    return r;
                })
                .toArray(int[][]::new);

        return ans;
    }

    public static void print(int[][] input) {

        for(int i = 0; i < input.length; i++){
            System.out.println(Arrays.toString(input[i]));
        }
        System.out.println("---------------------------");
    }
}
