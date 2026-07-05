class Solution {
    public int maxDigitRange(int[] arr) {
        int[] range = new int[arr.length];
        int maxRange=Integer.MIN_VALUE;
        int j=0;
        for(int i=0 ; i<arr.length ; i++){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int n=arr[i];
            while(n>0){
                int digit=n%10;
                max=Math.max(max,digit);
                min=Math.min(min,digit);
                n=n/10;
            }
            int x=max-min;
            maxRange=Math.max(maxRange,x);
            range[j++] = x;
        }
        int ans=0;
        for(int i=0 ; i<range.length ; i++){
            if(range[i] == maxRange){
                ans += arr[i];
            }
        }
        return ans;
    }
}