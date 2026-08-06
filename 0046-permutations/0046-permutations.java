class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        helper(nums , 0 , ans , new ArrayList<>(), vis);
        return ans;
    }
    public static void helper(int[] arr, int i , List<List<Integer>> ans ,
    ArrayList<Integer> l1, boolean[] vis){
        if(i==arr.length){
            ans.add(new ArrayList<>(l1));
            return;
        }
        
        for(int j=0 ; j<vis.length ; j++){
            if(!vis[j]){
                l1.add(arr[j]);
                vis[j]=true;
                helper(arr,i+1,ans,l1,vis);
                l1.remove(l1.size()-1);
                vis[j]=false;
                
            }
        }
        return;
    }   
}