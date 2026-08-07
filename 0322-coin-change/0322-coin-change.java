class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        int ans = helper(coins,0,amount,dp);
        if(ans==Integer.MAX_VALUE)
            return -1;
        else
            return ans;
    }
    public int helper(int[] arr , int i , int sum, int[][] dp){
        if(sum==0)
            return 0;
        if(i==arr.length || sum<0)
            return Integer.MAX_VALUE;
            
        int pick=Integer.MAX_VALUE;
        if(dp[i][sum] != -1)
            return dp[i][sum];
        // int temp=0;
        if(sum>=arr[i]){
            int temp = helper(arr,i,sum-arr[i],dp);
            if(temp != Integer.MAX_VALUE)
                pick = 1 + temp;
        }
        int notPick =helper(arr,i+1,sum,dp);
        return dp[i][sum] = Math.min(pick,notPick);
    }
}