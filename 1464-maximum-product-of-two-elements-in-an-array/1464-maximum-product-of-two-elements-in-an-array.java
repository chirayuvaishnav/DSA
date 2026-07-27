class Solution {
    public int maxProduct(int[] arr) {
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int a : arr){
            if(a>max){
                secMax = max;
                max=a;
            }
            else if (a > secMax) {
                secMax = a;
            }
        }
        return (max-1)*(secMax-1);
    }
}