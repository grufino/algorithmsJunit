package problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class PossibleBipartition {
    public static boolean possibleBipartition(int N, int[][] dislikes) {

        HashMap<Integer, LinkedList<Integer>> adjList = new HashMap<>();

        for (int i = 0; i < dislikes.length; i++) {
            LinkedList<Integer> existing = adjList.getOrDefault(dislikes[i][0], new LinkedList<>());
            existing.add(dislikes[i][1]);
            adjList.put(dislikes[i][0], existing);

            LinkedList<Integer> existing2 = adjList.getOrDefault(dislikes[i][1], new LinkedList<>());
            existing2.add(dislikes[i][0]);
            adjList.put(dislikes[i][1], existing2);
        }

        Stack<Integer> stack = new Stack<Integer>();

        HashMap<Integer, Integer> rooms = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            if(rooms.containsKey(i)) continue;
            stack.push(i);
            rooms.put(i, 1);
            while (!stack.empty()) {
                int next = stack.pop();
                int nextRoom = rooms.get(next);
                if (adjList.containsKey(next)) {
                    LinkedList<Integer> neighbors = adjList.getOrDefault(next, new LinkedList<>());
                    for (Integer el : neighbors) {
                        if (rooms.containsKey(el)) {
                            int room = rooms.get(el);
                            if (room == nextRoom) {
                                return false;
                            }
                        } else {
                            stack.push(el);
                            rooms.put(el, 1 - nextRoom);
                        }
                    }
                }
            }
        }
        return true;
    }
}
