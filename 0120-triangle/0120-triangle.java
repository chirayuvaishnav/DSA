class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        Integer[][] dp = new Integer[n][n];

        // for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }
        return helper(triangle, 0, 0,dp);
    }

    public int helper(List<List<Integer>> triangle, int row, int col, Integer[][] dp) {

        // Base case: reached the last row
        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }
        if(dp[row][col] != null)
            return dp[row][col];
        int down = helper(triangle, row + 1, col,dp);
        int diagonal = helper(triangle, row + 1, col + 1,dp);

        dp[row][col]= triangle.get(row).get(col) + Math.min(down, diagonal);
        return dp[row][col];
    }
}