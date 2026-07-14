class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int dif = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length-1 ; i++){
            dif=Math.min(dif , arr[i+1]-arr[i]);
        }
        for(int i=0 ; i<arr.length-1; i++){
            if(arr[i+1] - arr[i] == dif){
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return res;
    }
}