class Solution {
    private long DFS(int[][] grid, int i, int j, boolean[][] isVisited){
        if(grid[i][j]==0) return 0;

        isVisited[i][j] = true;

        long value = grid[i][j];
        int[] dX = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for(int k=0;k<4;k++){
            int row = i + dX[k];
            int col = j + dy[k];

            if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && !isVisited[row][col]){
                value += DFS(grid, row, col, isVisited);
            }
        }

        return value;
    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] isVisited = new boolean[m][n];
        int count = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!isVisited[i][j] && grid[i][j]!=0){
                    long totalValue = DFS(grid, i, j, isVisited);

                    if(totalValue!=0L && totalValue % k==0) count++;
                }
            }
        }

        return count;
    }
}