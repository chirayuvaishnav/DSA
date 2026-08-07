class Solution {
    public int change(int amount, int[] coins) {
    int[][] dp = new int[coins.length][amount+1];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return helper(coins,0,amount,dp);
        
    }
    public int helper(int[] arr ,int i, int sum, int[][] dp){
        if(sum==0)
            return 1;
        if(i>=arr.length || sum<0)
            return 0;
        if(dp[i][sum] != -1)
            return dp[i][sum];
        int take = helper(arr,i,sum-arr[i],dp);
        int notTake = helper(arr,i+1,sum,dp);
        return dp[i][sum] = take+notTake;
        
    }
}