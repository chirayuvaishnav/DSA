class Solution {
    public int strStr(String haystack, String needle) {
        int occ = Integer.MAX_VALUE;
        boolean flag=false;
        for(int i=0 ; i<haystack.length() ; i++){
            if(haystack.contains(needle)){
                occ=Math.min(occ,haystack.indexOf(needle));
                flag=true;
            }
        }
        if(flag)
            return occ;
        else
            return -1;
    }
}