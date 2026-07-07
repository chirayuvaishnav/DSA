class Solution {
    public long sumAndMultiply(int n) {
        int x=0;
        while(n>0){
            int digit = n%10;
            if(digit != 0)
                x= (10*x)+digit;
            n/=10;
        }
        long rev=0;
        long sum=0;
        while(x>0){
            int dig = x%10;
            rev = (10*rev)+dig;
            sum += dig;
            x/=10;
        }
        return rev*sum;
    }
}