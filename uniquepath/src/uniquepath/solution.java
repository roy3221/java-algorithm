package uniquepath;

import java.util.ArrayList;
import java.util.List;

public class solution {
	 public int uniquePaths(int m, int n) {
		 List<boolean[][]> path= new ArrayList<>();
		 boolean[][] visited= new boolean[m][n];
		 int row=0,col=0;
		 while(row<m&&col<n){
			dfs(m,n,path,row,col, visited);
			row++;
			col++;
		 }
		 return path.size();
	 }
	 
	 private void dfs(int m, int n, List<boolean[][]> path, int row, int col, boolean[][] visited){
		 visited[row][col]=true;
		 visited[row][col]=true;
		 if(row==m-1&&col==n){
			 if(!path.contains(visited)){
				path.add(visited); 
			 }
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					visited[m][n]=false;
				}
			}
		 }
		 if(row<m-1){
			 dfs(m,n,path,row+1,col,visited);
		 }
		 if(col<n-1){
			 dfs(m,n,path,row,col+1,visited);			 
		 }
	 }
	 
	 public static void main(String args[]){
		 int m=6, n=6;
		 System.out.println(new solution().uniquePaths(m, n));
	 }
}
