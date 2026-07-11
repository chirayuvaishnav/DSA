class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length()-1;
        
        while(s.charAt(end) == ' ')
            end--;
        if(s.length() == 1 && s.charAt(0) != ' ')
            return 1;
        int cnt=0;
        while(end>=0 && s.charAt(end) != ' '){
            cnt++;
            end--;
        }
        return cnt;
    }
}