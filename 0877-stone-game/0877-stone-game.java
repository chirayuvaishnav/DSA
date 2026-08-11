class Solution {

    public boolean stoneGame(int[] piles) {
        int sum =0;
        for(int a : piles)
            sum+= a;
        int[][] dp = new int[piles.length][piles.length];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        int alice = helper(piles ,0,piles.length-1,dp);
        if(alice > sum/2)
            return true;
        else
            return false;
    }
    public int helper(int[] arr , int i , int j, int[][] dp ){
        if(j<i)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        int take_i = arr[i] + Math.min(helper(arr,i+2,j,dp), helper(arr,i+1,j-1,dp)); 
        int take_j = arr[j] + Math.min(helper(arr,i,j-2,dp), helper(arr,i+1,j-1,dp));
        return dp[i][j] = Math.max(take_i , take_j);
    }
}