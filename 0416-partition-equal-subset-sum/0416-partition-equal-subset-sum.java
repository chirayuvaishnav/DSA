class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int a : nums)
            sum+=a;
        if(sum%2 != 0)
            return false;
        Boolean[][] dp = new Boolean[nums.length][sum+1];
        return helper(nums,nums.length-1,sum/2,dp);
    }
    public boolean helper(int[] arr ,int i , int tar, Boolean[][] dp){
        if(tar == 0 )
            return true;
        if(i<0)
            return false;
        if(dp[i][tar] != null)
            return dp[i][tar];
        boolean notTake=helper(arr,i-1,tar,dp);
        boolean take=false;
        if(tar>=arr[i]){
            take=helper(arr,i-1,tar-arr[i],dp);
        }
        return dp[i][tar] = take||notTake;
    }
}