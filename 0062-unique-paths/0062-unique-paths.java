class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }

        return helper(0, 0, m, n ,dp);
    }

    public int helper(int i, int j, int m, int n ,int[][] dp) {
        // reached destination
        if (i == m - 1 && j == n - 1)
            return 1;

        // out of bounds
        if (i >= m || j >= n)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];

        int right = helper(i, j + 1, m, n ,dp );
        int down  = helper(i + 1, j, m, n ,dp);

        dp[i][j]=right+down;
        return dp[i][j];
    }
}
