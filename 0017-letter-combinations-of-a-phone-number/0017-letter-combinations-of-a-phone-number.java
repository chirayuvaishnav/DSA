class Solution {
        List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        Map<Integer,String> mp = new HashMap<>();
        mp.put(2,"abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5,"jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");
        helper(0,digits,new StringBuilder(), mp);
        return ans;
    }
    public void helper(int i, String dig, StringBuilder temp, Map<Integer,String> mp){
        if(i>=dig.length()){
            ans.add(temp.toString());
            return;
        }
        int cur = dig.charAt(i)-'0';
        String letters = mp.get(cur);
        for(int j=0 ; j<letters.length() ; j++){
            temp.append(letters.charAt(j));
            helper(i+1,dig,temp,mp);
            temp.deleteCharAt(temp.length()-1);
        }
        return;
    }
}