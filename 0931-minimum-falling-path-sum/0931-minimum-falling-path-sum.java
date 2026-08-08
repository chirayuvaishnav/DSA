class Solution {
    public int minFallingPathSum(int[][] mat) {
        int n = mat.length;
		int m = mat[0].length;
		int[][] dp = new int[n][m];
		for(int[] row : dp)
		    Arrays.fill(row,Integer.MAX_VALUE);
		int min = Integer.MAX_VALUE;
		for (int i = 0 ; i<m ; i++) {
			min = Math.min(min, helper(mat, 0, i, n, m,dp));
		}
		return min;
		
	}
	public int helper(int[][] arr, int i, int j, int n, int m,int[][] dp) {
		if (i == n - 1) {
			// int max=Integer.MIN_VALUE;
			// for(int j= 0 ; j<m ; j++){
			//     if(j==last || j==last-1 || j==last+1)
			//         max=Math.max(max,arr[i][j]);
			// }
			// return max;
			
			return arr[i][j];
		}
// 		if (j - 1 <0 || j + 1 >arr.length)
// 			return Integer.MIN_VALUE;
		if(dp[i][j] != Integer.MAX_VALUE)
		    return dp[i][j];
		int min = Integer.MAX_VALUE;
		int left=Integer.MAX_VALUE;
		int right=Integer.MAX_VALUE;
		int down = arr[i][j]+helper(arr, i + 1, j, n, m,dp);
		if(j-1>=0)
		    left = arr[i][j]+helper(arr, i + 1, j - 1, n, m,dp);
		if(j+1<m)
		    right = arr[i][j]+helper(arr, i + 1, j + 1, n, m,dp);
		
		min = Math.min(down, left);
		min = Math.min(min, right);
		
		return dp[i][j] = min;
	}
}