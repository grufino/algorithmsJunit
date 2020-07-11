package problems;

import java.util.*;

public class ShortestPathAlternatingColors {
    HashMap<Integer, LinkedList<Integer>> redAdjList;
    HashMap<Integer, LinkedList<Integer>> blueAdjList;
    int n;

    public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
        this.n = n;
        redAdjList = new HashMap<>();

        for (int i = 0; i < red_edges.length; i++) {
            LinkedList<Integer> neighbors = redAdjList.getOrDefault(red_edges[i][0], new LinkedList<Integer>());
            neighbors.add(red_edges[i][1]);
            redAdjList.put(red_edges[i][0], neighbors);
        }
        blueAdjList = new HashMap<>();

        for (int i = 0; i < blue_edges.length; i++) {
            LinkedList<Integer> neighbors = blueAdjList.getOrDefault(blue_edges[i][0], new LinkedList<Integer>());
            neighbors.add(blue_edges[i][1]);
            blueAdjList.put(blue_edges[i][0], neighbors);
        }

        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        LinkedList<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            int[] colors = new int[]{0,1};
            for(int j = 0; j < colors.length; j++){
                int c = colors[j];
                HashSet<String> visited = new HashSet<>();
                queue.add(new int[]{0,0, c});

                while(!queue.isEmpty()){
                    int[] next = queue.poll();
                    int s = next[0];
                    int curLevel = next[1];
                    if(s == i){
                        if(ans[i] == -1){
                            ans[i] = curLevel;
                        } else {
                            ans[i] = Math.min(curLevel, ans[i]);
                        }
                        queue.clear();
                        break;
                    }
                    c = next[2];
                    String seq = c + " " + s;
                    if(!visited.add(seq)) continue;

                    Iterator<Integer> colorNeighborsIt = null;

                    if (c == 0) {
                        colorNeighborsIt = redAdjList.getOrDefault(s, new LinkedList<>()).iterator();
                    } else if (c == 1) {
                        colorNeighborsIt = blueAdjList.getOrDefault(s, new LinkedList<>()).iterator();
                    }

                    while(colorNeighborsIt.hasNext()){
                        queue.add(new int[]{colorNeighborsIt.next(), curLevel + 1, 1 - c});
                    }
                    queue.isEmpty();
                }
            }
        }

        return ans;
    }
}
