    import java.util.*;
public class DayTwentyEight {


    public int shortestPath(int V, int[][] edges, int start, int end) {



        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) adj.add(new ArrayList<>());



        for(int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);



        }

        Queue<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[V];


        q.add(new int[]{start, 0});
        visited[start] = true;

        while(!q.isEmpty()) {


            int[] cur = q.poll();
            int node = cur[0], dist = cur[1];
            if(node == end) return dist;
            for(int nei : adj.get(node)) {
                if(!visited[nei]) {



                    visited[nei] = true;
                    q.add(new int[]{nei, dist + 1});


                }
            }

        }
        return -1;
    }



    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1},{0,2},{1,3},{2,3},{3,4}};

        
        int start = 0, end = 4;
        DayTwentyEight sol = new DayTwentyEight();


        System.out.println(sol.shortestPath(V, edges, start, end));
    }
}

    

