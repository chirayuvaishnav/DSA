class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int n = arr.length;
        int[] maxLeft = new int[n];
        int[] minRight = new int[n];
        maxLeft[0]=arr[0];
        minRight[n-1]=arr[n-1];
        for(int i = 1 ; i<n ; i++){
            if(arr[i] > maxLeft[i-1]){
                maxLeft[i]=arr[i];
            }
            else
                maxLeft[i]=maxLeft[i-1];
        }
        for(int i = n-2 ; i>=0 ; i--){
            if(arr[i] < minRight[i+1]){
                minRight[i]=arr[i];
            }
            else
                minRight[i]=minRight[i+1];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++){
            if(maxLeft[i]-minRight[i] <= k)
                ans=Math.min(ans,i);
        }
        if(ans==Integer.MAX_VALUE)
            return -1;
        else
            return ans;
    }
}