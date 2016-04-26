
public class Solution {
	int numIslands;
    int row_num;
    int col_num;
    public int numIslands(char[][] grid) {
        numIslands = 0;
        if(grid == null || grid.length == 0) return numIslands;
        row_num = grid.length;
        col_num = grid[0].length;
        boolean[][] visited = new boolean[row_num][col_num];
        for(int i = 0; i < row_num; i++) {
            for(int j =0; j < col_num; j++) {
                if(!visited[i][j] && grid[i][j] == '1'){
                findIslands(i, j, grid, visited);
                numIslands++;
                }
            }
        }
        return numIslands;
    }
    
    private void findIslands(int i, int j, char[][] grid, boolean[][] visited) {
        // System.out.println("i = "+ i+"; j = "+ j);
        if(i < 0 || j < 0 || i == row_num || j == col_num || grid[i][j] == '0' || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        findIslands(i+1, j, grid, visited);
        findIslands(i-1, j, grid, visited);
        findIslands(i, j+1, grid, visited);
        findIslands(i, j-1, grid, visited);
       
    }   
}
