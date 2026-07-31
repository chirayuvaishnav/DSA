class Solution {
    public int sumFourDivisors(int[] arr) {
        int finalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            int sum = 0;
            for (int j = 1; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    if (j == arr[i] / j) {
                        cnt++;
                        sum += j;
                    } else {
                        cnt += 2;
                        sum += j;
                        sum += arr[i] / j;
                    }
                }
            }
            if (cnt == 4) {
                finalSum += sum;
            }
        }
        return finalSum;
    }
}