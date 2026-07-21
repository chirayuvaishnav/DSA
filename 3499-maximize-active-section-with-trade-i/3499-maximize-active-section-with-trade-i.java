class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int one =0 ;
        int prev=-1;
        int n=s.length();
        int i=0;
        int max=0;
        while(i<n){
            if(s.charAt(i) == '1'){
                one++;
                i++;
            }
            else{
                int cur=0;
                while(i<n && s.charAt(i) == '0'){
                    cur++;
                    i++;
                }
                if(prev>0){
                    max=Math.max(max,prev+cur);
                }
                prev=cur;
            }
        }
        return max+one;
    }
}