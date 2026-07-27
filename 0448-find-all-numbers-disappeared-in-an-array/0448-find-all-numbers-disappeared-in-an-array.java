class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        // Arrays.sort(arr);
        int[] temp = new int[arr.length];
        Arrays.fill(temp,-1);
        for(int i=0 ; i<arr.length ; i++){
            temp[arr[i] - 1]=1;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr.length ; i++){
            if(temp[i] == -1)
                res.add(i+1);
        }
        return res;
    }
}