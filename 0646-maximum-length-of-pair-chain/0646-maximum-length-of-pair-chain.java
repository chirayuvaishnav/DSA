class Solution {
    public int findLongestChain(int[][] arr) {
        int cnt = 1;
        Arrays.sort(arr,(a,b) -> a[1] - b[1]);
        int lastEnd = arr[0][1];
        for(int i=1 ; i<arr.length ; i++){
            if(lastEnd < arr[i][0]){
                cnt++;
                lastEnd = arr[i][1];
            }
            
        }
        return cnt;
    }
}