class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        int min=Integer.MAX_VALUE;
        return helper(grid , 0 , 0 , m ,n ,dp, min);
    }
    public int helper(int[][] arr , int i , int j , int m , int n , int[][] dp, int min){
        if(i==m-1 && j==n-1)
            return arr[i][j];
        
        if (i >= m || j >= n)
            return (int)1e9;

        if(dp[i][j] != -1)
            return dp[i][j];
        int right =  helper(arr,i, j + 1, m, n ,dp, min );
        int down  =  helper(arr,i + 1, j, m, n ,dp, min);
        
        dp[i][j] = arr[i][j] + Math.min(right, down);
        return dp[i][j];
    }
}