class Solution {
    public int rob(int[] arr) {
        int n  = arr.length;
        if (n == 1)
            return arr[0];

        int[] arr1 = new int[n - 1]; // Exclude last house
        int[] arr2 = new int[n - 1]; // Exclude first house

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = arr[i];
            arr2[i] = arr[i + 1];
        }

        int[] dp1 = new int[n - 1];
        int[] dp2 = new int[n - 1];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int ans1 = check(arr1, arr1.length - 1, dp1);
        int ans2 = check(arr2, arr2.length - 1, dp2);

        return Math.max(ans1, ans2);



    }
    public int check(int[] arr , int n , int[] dp){
       
        if(n==0)
            return arr[n];
        if(n<1)
            return 0;
        if(dp[n] != -1 )
            return dp[n];
        int pick = arr[n] + check(arr , n-2 , dp);
        int notPick = 0 + check(arr , n-1  ,  dp);
        dp[n] =  Math.max(pick , notPick);
        return dp[n];
    }
}