class Solution {
    public boolean isMatch(String txt, String pat) {
     Boolean[][] dp = new Boolean[txt.length()][pat.length()];
		return helper(txt.length() - 1, pat.length() - 1, txt, pat,dp);
	}
	public boolean helper(int n, int m, String txt, String pat,Boolean[][] dp) {
		if (n < 0) {
			while (m >= 0) {
				if (pat.charAt(m) != '*')
					return false;
				m--;
			}
			return true;
		}
		if (m < 0)
            return false;
            
        if(dp[n][m] != null)
            return dp[n][m];
		boolean empty = false;
		boolean take = false;
		if (pat.charAt(m) == '*') {
			empty = helper(n, m - 1, txt, pat,dp);
			take = helper(n - 1, m, txt, pat,dp);
			// return empty || take;
		}
		else if (pat.charAt(m) == '?') {
			take = helper(n - 1, m - 1, txt, pat,dp);
		}
		else if (txt.charAt(n) == pat.charAt(m)) {
			take = helper(n - 1, m - 1, txt, pat,dp);
		}
		return dp[n][m] = empty || take;
	}
}