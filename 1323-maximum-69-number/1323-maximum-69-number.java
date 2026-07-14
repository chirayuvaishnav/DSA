class Solution {
    public int maximum69Number (int num) {
        String arr = String.valueOf(num);
        int res = 0;
        boolean flag = false;
        for(int i=0 ; i<arr.length() ; i++){
            if(!flag && arr.charAt(i) != '9'){
                res= (res*10)+9;
                flag=true;
            }
            else{
                res= (res*10)+(arr.charAt(i)-'0');
            }
                
        }
        return res;
    }
}