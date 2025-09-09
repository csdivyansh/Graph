class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];
        dfshelper(adj, 0, ans, vis);
        return ans;
    }
    
    private void dfshelper(ArrayList<ArrayList<Integer>> adj, int node, ArrayList<Integer> ans, boolean[] vis){
        vis[node] = true;
        ans.add(node);
        for(int nei : adj.get(node)) {
            if(!vis[nei]) {
                dfshelper(adj, nei, ans, vis);
            }
        }
    }
    
}
