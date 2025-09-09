class Solution {
    private static boolean isValid(int nr, int nc, int rows, int cols, boolean[][] vis, char[][] mat){
        return nr >= 0 && nc >= 0 && nr < rows && nc < cols && !vis[nr][nc] && mat[nr][nc] != 'W';
    }
    private void bfs_mat(int sr, int sc, char[][] grid, boolean[][] vis) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr,sc});
        vis[sr][sc] = true;

        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int cr = curr[0];
            int cc = curr[1];
            int[] dr = {1,0,-1,0,-1,1,-1,1};
            int[] dc = {0,1,0,-1,-1,1,1,-1};
            for(int i = 0; i < 8; i++) {
                int nr = cr + dr[i];
                int nc = cc + dc[i];
                if(isValid(nr,nc,m,n,vis,grid)) {
                    vis[nr][nc] = true;
                    q.add(new int[]{nr, nc});
                }
            }
        }
    }
    public int countIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(!vis[i][j] && grid[i][j] != 'W') {
                    bfs_mat(i, j, grid, vis);
                    count++;
                }
            }
        }
        return count;
    }
}
