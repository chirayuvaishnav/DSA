class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return helper(0,prices,1,dp);
    }
    public int helper(int i ,int[] arr , int buy,int[][] dp){
        if(i == arr.length)
            return 0;
        if(dp[i][buy] != -1)
            return dp[i][buy];
        int profit=0;
        if(buy==1){ //1 represents we can buy and 0 represents we cannot buy
            profit=Math.max(-arr[i]+helper(i+1,arr,0,dp) , 0+helper(i+1,arr,1,dp));
        }
        else{
            profit=Math.max(arr[i]+helper(i+1,arr,1,dp) , 0+helper(i+1,arr,0,dp));   
        }
        return dp[i][buy] = profit;
    }
}