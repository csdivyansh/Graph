class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        set.add(0);
        ans.add(0);
        
        while(!q.isEmpty()) {
            int node = q.poll();
            for(int i = 0; i < adj.get(node).size(); i++) {
                if(!set.contains(adj.get(node).get(i))) {
                    q.add(adj.get(node).get(i));
                    set.add(adj.get(node).get(i));
                    ans.add(adj.get(node).get(i));
                }
            }
        }
        
        return ans;
    }
}
