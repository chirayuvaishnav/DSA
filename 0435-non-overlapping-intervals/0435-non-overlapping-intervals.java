class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);

        int cnt=0;
        int prevEnd = arr[0][1];
        for (int i = 1; i < arr.length; i++) {

            // Overlapping intervals
            if (arr[i][0] < prevEnd) {
                cnt++;
            }
            else
                prevEnd=arr[i][1];
        }

        return cnt;
    }
}