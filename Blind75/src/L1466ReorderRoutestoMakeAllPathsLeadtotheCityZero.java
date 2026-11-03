import java.util.*;

public class L1466ReorderRoutestoMakeAllPathsLeadtotheCityZero {
    public int minReorder(int n, int[][] connections) {
        List<int[]>[] adj = new ArrayList[n];
        for(int i = 0; i<n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] edge : connections){
            int a = edge[0];
            int b = edge[1];

            adj[a].add(new int[]{b, 1});
            adj[b].add(new int[]{a, 0});
        }
        return dfs(0, -1, adj);
    }
    private int dfs(int node, int parent, List<int[]>[] adj){
        int changes = 0;
        for(int[] edge : adj[node]){
            int next = edge[0];
            int cost = edge[1];
            if(next == parent){
                continue;
            }
            changes += cost;
            changes += dfs(next, node, adj);
        }
        return changes;
    }
    public static void main(String[] args) {
    }
}
