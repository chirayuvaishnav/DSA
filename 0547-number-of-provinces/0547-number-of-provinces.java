class Solution {
    public int findCircleNum(int[][] arr) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
        adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }
        int[] vis=new int[n];
        Arrays.fill(vis,0);
        int cnt=0;
        for(int i=0 ; i<vis.length ; i++){
            if(vis[i] == 0){
                dfs(vis , adj , i);
                cnt++;
            }
        }
        return cnt;
    }

    public void dfs(int[] vis , ArrayList<ArrayList<Integer>> adj , int
     start  ){
        vis[start] = 1;
        for(int i=0 ; i<adj.get(start).size() ; i++){
            if(vis[adj.get(start).get(i)] != 1){
                dfs(vis , adj , adj.get(start).get(i));
            }
        }
     }
}