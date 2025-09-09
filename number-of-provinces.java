class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        int count = 0;
        boolean [] vis = new boolean[V]; 
        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                dfs(adj, i, vis);
                count++;
            }
        }
        return count;
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean[] vis) {
        vis[node] = true;
        
        for(int j = 0; j < adj.get(node).size(); j++) {
            if(adj.get(node).get(j) == 1 && !vis[j]) {
                dfs(adj, j, vis);
            }
        }
    }
};
