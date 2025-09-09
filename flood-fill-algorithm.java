class Solution {
    private void solve(int[][] image, int i, int j, int newColor, int m, int n, int[][] vis, int color) {
        if(i >= m || j >= n || i < 0 || j < 0 || vis[i][j] == 1 || image[i][j] != color) {
            return;
        }
        
        image[i][j] = newColor;
        vis[i][j] = 1;
        solve(image, i + 1, j, newColor, m, n, vis, color);
        solve(image, i, j + 1, newColor, m, n, vis, color);
        solve(image, i, j - 1, newColor, m, n, vis, color);
        solve(image, i - 1, j, newColor, m, n, vis, color);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length;
        int m = image[0].length;
        int[][] vis = new int[n][m];
        int color = image[sr][sc];
        solve(image, sr, sc, newColor, n, m, vis, color);
        return image;
    }
}
