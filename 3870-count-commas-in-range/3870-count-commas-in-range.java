class Solution {
    public int countCommas(int n) {
        StringBuilder str = new StringBuilder(Integer.toString(n));
        int len = str.length();
        if(n<1000){
            return 0;
        }
        else{
            return n-999;
        }
    }
}