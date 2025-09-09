
    import java.util.*;

class soll {
    public boolean hasCycle(int V, int[][] edges) {


        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for(int[] e : edges) {


            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

    boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++) {

            if(!visited[i]) {
                if(dfs(i, -1, visited, adj)) return true;
     }
        }
        return false;



    }

    private boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;


        for(int nei : adj.get(node)) {
 if(!visited[nei]) {
                if(dfs(nei, node, visited, adj)) return true;
            } else if(nei != parent) {
                return true;


            }
        }
    return false;
    }
}

public class DayTwentySix {
    public static void main(String[] args) {


        int V = 5;
        int[][] edges = {{0,1},{1,2},{2,3},{3,4},{4,0}};
        soll sol = new soll();


        System.out.println(sol.hasCycle(V, edges)); }

}

    

