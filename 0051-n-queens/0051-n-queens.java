class Solution {
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        helper(1, n, new ArrayList<>(), new ArrayList<>());
        return ans;

    }

    public void helper(int x, int n, ArrayList<Integer> check,
            ArrayList<String> l1) {
        if (x == n + 1) {
            ans.add(new ArrayList<>(l1));
            return;
        }

        // Try every column
        for (int col = 1; col <= n; col++) {

            if (isSafe(x, col, check)) {
                StringBuilder board = new StringBuilder();
                for(int j=0 ; j<n ; j++){
                    board.append('.');
                }

                board.setCharAt(col - 1, 'Q'); 
                // Choose
                l1.add(board.toString());
                check.add(col);

                // Explore
                helper(x + 1, n, check, l1);

                // Backtrack
                board.setCharAt(col - 1, '.');
                check.remove(check.size() - 1);
                l1.remove(l1.size() - 1);
            }
        }
    }

    public boolean isSafe(int row, int col, ArrayList<Integer> check) {

        // check contains the column of queens
        // placed in previous rows

        for (int prevRow = 1; prevRow <= check.size(); prevRow++) {

            int prevCol = check.get(prevRow - 1);

            // Same column
            if (prevCol == col) {
                return false;
            }

            // Same diagonal
            if (Math.abs(row - prevRow) == Math.abs(col - prevCol)) {
                return false;
            }
        }

        return true;
    }
}