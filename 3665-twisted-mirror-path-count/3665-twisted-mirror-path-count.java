class Solution {
    long MOD = 1000000007;

    int solve(int grid[][], int r, int c, int d, int[][][] dp) {
        if (r == grid.length - 1 && c == grid[0].length - 1) return 1;
        if (r >= grid.length || c >= grid[0].length) return 0;
        if (dp[r][c][d] != -1) return dp[r][c][d];

        if (grid[r][c] == 1) {
            if (d == 0)
                return dp[r][c][d] = solve(grid, r + 1, c, 1, dp);
            else
                return dp[r][c][d] = solve(grid, r, c + 1, 0, dp);
        }

        return dp[r][c][d] = (int)((solve(grid, r + 1, c, 1, dp) + solve(grid, r, c + 1, 0, dp)) % MOD);
    }

    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][][] dp = new int[m][n][2];

        for (int[][] k : dp)
            for (int[] l : k)
                Arrays.fill(l, -1);

        return solve(grid, 0, 0, 0, dp);
    }
}