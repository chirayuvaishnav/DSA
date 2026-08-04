class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums){
            set.add(a);
            min=Math.min(min,a);
            max=Math.max(max,a);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=min ; i<=max ; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}