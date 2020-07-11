package problems;

import java.util.*;

public class DungeonGame {

    private class Pair{
        private int fst;
        private int snd;
        public Pair(int a, int b) {
            fst = a;
            snd = b;
        }
        //Depends only on account number
        @Override
        public int hashCode() {
            int result = fst * 31 + snd;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Pair other = (Pair) obj;

            return (this.fst == other.fst && this.snd == other.snd);
        }
    }

    HashMap adjList;
    int[][] dungeon;
    PriorityQueue<Integer> candidates;
    public int calculateMinimumHP(int[][] dungeon) {
//        System.out.println(Arrays.deepToString(dungeon));
        this.adjList = convert(dungeon);
        this.dungeon = dungeon;
        candidates = new PriorityQueue<>();
//        System.out.println(adjList);

        dfs(new Pair(dungeon.length-1,dungeon[0].length-1), 1);
//        System.out.println(candidates);
        return candidates.peek();
    }

    public void dfs(Pair actual, int totalHealth){
        int curV = dungeon[(actual).fst][(actual).snd];
        int newActual = totalHealth;
        if(curV > 0){
            if(curV >= newActual){
                newActual = 1;
            } else {
                newActual -= curV;
            }
        } else {
            newActual = totalHealth + curV * -1;
        }

        if(actual.fst == 0 && actual.snd == 0){
            candidates.add(newActual);
        }

        LinkedList neighbors = (LinkedList) adjList.get(actual);
        final int a = newActual;
        neighbors.forEach(neighbor -> {
            dfs((Pair) neighbor, a); });

    }

    public HashMap<Pair, LinkedList<Pair>> convert(int[][] a)
    {
        HashMap adjList = new HashMap<Pair, LinkedList<Pair>>();

        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[0].length; col++){
                Pair curPair = new Pair(row, col);
                LinkedList<Pair> actual = (LinkedList<Pair>) adjList.getOrDefault(curPair, new LinkedList<Pair>());
                if(row > 0) actual.add(new Pair(row - 1, col));
                if(col > 0) actual.add(new Pair(row, col-1));
                // not necessary because we only go up, for a full adj list, this will be necessary
//                if(row < a.length) actual.add(new Pair(row + 1, col));
//                if(col < a[0].length) actual.add(new Pair(row, col + 1));


                adjList.put(curPair, actual);
            }
        }

        return adjList;
    }
}
