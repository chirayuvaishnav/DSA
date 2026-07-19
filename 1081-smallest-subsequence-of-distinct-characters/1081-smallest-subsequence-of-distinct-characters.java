class Solution {
    public String smallestSubsequence(String s) {
        int[] last = new int[26];
        Arrays.fill(last,0);
        boolean[] check = new boolean[26];
        Arrays.fill(check,false);
        StringBuilder ans = new StringBuilder();
        int j=0;
        for(int i=0 ; i<s.length() ; i++){
            last[s.charAt(i)-'a'] = i;
        }
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(check[ch-'a'])
                continue;
            while(ans.length() > 0 && ans.charAt(ans.length()-1) > ch && last[ans.charAt(ans.length()-1)-'a'] > i){
                check[ans.charAt(ans.length()-1)-'a'] = false;
                ans.deleteCharAt(ans.length() - 1);
            }
            ans.append(ch);
            check[ch-'a']= true;
        }
        return ans.toString();
    }
}