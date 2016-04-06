
public class Min_Path_Sum {
	public int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
        if(m == 0) return 0;
        int[][] res = new int[m][n];
        res[0][0] = grid[0][0];
        for(int i = 1; i < m; i++) {
            res[i][0] = res[i-1][0] + grid[i][0]; 
        }
        for(int j = 1; j < n; j++) {
            res[0][j] = res[0][j-1] + grid[0][j];
        }
        
        for(int i = 1; i < m; i++) {
            for(int j =1; j < n; j++) {
                res[i][j] = Math.min(grid[i][j] + res[i-1][j], grid[i][j] + res[i][j-1]);
            }
        }
        return res[m-1][n-1];
    }

}
