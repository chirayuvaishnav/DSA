class Solution {
    public int countMajoritySubarrays(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int targetCount = 0;

            for (int j = i; j < n; j++) {

                if (arr[j] == target)
                    targetCount++;

                int len = j - i + 1;

                if (targetCount > len / 2)
                    ans++;
            }
        }

        return ans;
    }
}