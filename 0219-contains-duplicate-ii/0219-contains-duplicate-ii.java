class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        Map<Integer , Integer> mp = new HashMap<>();
        int l=0;
        int r=arr.length;
        while(l<r){
            if(mp.containsKey(arr[l])){
                int dig= Math.abs(mp.get(arr[l]) - l);
                if(dig <= k)
                    return true;
            }
            mp.put(arr[l],l);
            l++;
        }
        return false;
    }
}