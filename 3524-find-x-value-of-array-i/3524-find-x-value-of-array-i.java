class Solution {

    public long[] resultArray(int[] nums, int k) {

        long[] ans = new long[k];
        long[] dp = new long[k];

        for (int num : nums) {

            long[] next = new long[k];

            int x = num % k;

            // Subarray containing only current number
            next[x]++;

            // Extend all previous subarrays
            for (int r = 0; r < k; r++) {
                next[(r * x) % k] += dp[r];
            }

            dp = next;

            // Add subarrays ending here to final answer
            for (int r = 0; r < k; r++) {
                ans[r] += dp[r];
            }
        }

        return ans;
    }
}