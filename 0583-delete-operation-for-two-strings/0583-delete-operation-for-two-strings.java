class Solution {
    public int minDistance(String text1, String text2) {
       int[][] dp = new int[text1.length()][text2.length()];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        int len = helper(0,0,text1,text2,dp);
        //we will find the longest common subsequence 
        //then we will subtract the length of LCS with S1 and S2 and then 
        //multiply it with there cost
        return (text1.length()-len)+(text2.length()-len);
    }
    public int helper(int i ,int j , String t1 ,String t2,int[][] dp){
        if(i==t1.length() || j==t2.length())
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        if(t1.charAt(i) == t2.charAt(j)){
            return dp[i][j] = 1 + helper(i+1,j+1,t1,t2,dp);
        }
        else{
            int left = helper(i+1,j,t1,t2,dp);
            int right = helper(i,j+1,t1,t2,dp);
            return dp[i][j] = Math.max(left, right);
        }
    }
}