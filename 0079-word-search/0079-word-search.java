class Solution {
    boolean flag = false;
    public boolean exist(char[][] board, String word) {
        boolean[][] vis = new boolean[board.length][board[0].length]; 
        for(int i =0 ; i<board.length ; i++){
            for(int j=0 ; j<board[0].length ; j++){
                helper(board,i,j,0,word,vis);
            }
        }
        return flag;
    }
    public void helper(char[][] arr , int row, int col , int idx , String word , boolean[][] vis){
        if(idx==word.length()){
            flag=true;
            return;
        }
        if(row>=arr.length || col>=arr[0].length || row<=-1 || col<=-1)
            return;
        
        if(!vis[row][col] && arr[row][col]==word.charAt(idx)){
            vis[row][col]=true;
            idx++;
            helper(arr,row+1,col,idx,word,vis);
            helper(arr,row,col+1,idx,word,vis);
            helper(arr,row-1,col,idx,word,vis);
            helper(arr,row,col-1,idx,word,vis);
            vis[row][col]=false;
        }
        else
            return;
    }
}