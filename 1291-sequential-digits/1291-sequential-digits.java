class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digit = "123456789"; 
        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();
        ArrayList<Integer> res = new ArrayList<>();

        for(int start = lowLen ; start<=highLen ; start++){

            for(int i=0 ; i+start <= 9 ; i++){
                int num = Integer.parseInt(digit.substring(i,i+start));
                if(low<=num && num <= high)
                    res.add(num);
            }
        }
        return res;
    }
}