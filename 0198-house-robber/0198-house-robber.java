class Solution {
    public int rob(int[] arr) {
        int n  = arr.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return check(arr, n-1 , dp);


    }
    public int check(int[] arr , int n , int[] dp){
        if(n==0)
            return arr[n];
        if(n<1)
            return 0;
        if(dp[n] != -1 )
            return dp[n];
        int pick = arr[n] + check(arr , n-2 , dp);
        int notPick = 0 + check(arr , n-1 , dp);
        dp[n] =  Math.max(pick , notPick);
        return dp[n];
    }
}