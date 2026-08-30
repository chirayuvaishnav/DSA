class Solution {
    public int minimumDeletions(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIdx=-1;
        int maxIdx=-1;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max=arr[i];
                maxIdx=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minIdx=i;
            }
        }
        int n=arr.length-1;
        int idxmax=Math.max(maxIdx,minIdx);
        int idxmin=Math.min(maxIdx,minIdx);
        int ans=Integer.MAX_VALUE;
        ans=Math.min(idxmax-0+1,n-idxmin+1);
        return Math.min(ans,((idxmin+1)+(n-idxmax+1)));
    }
}