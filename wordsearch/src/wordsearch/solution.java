package wordsearch;

public class solution {
	public boolean exist(char[][] board, String word) {
        int m = board.length;  
        int n = board[0].length;  
        int iteration=1;
        boolean[][] visited = new boolean[m][n];  
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) { 
            	System.out.println("The Iteration: "+ (iteration++));
            	System.out.println("The position is: "+i+", "+j);
                if (dfs(board, word, 0, i, j, visited))  
                    return true;  
            }  
        }  
        return false;  
    }
    
    public boolean dfs(char[][] board, String word, int index, int rowindex, int colindex, boolean[][] visited) {  
      
    	if (index == word.length())  //c1
            return true;  
        if (rowindex < 0 || colindex < 0 || rowindex >=board.length || colindex >= board[0].length)  //c2
            return false;  
        if (visited[rowindex][colindex])  //c3
            return false;  
        if (board[rowindex][colindex] != word.charAt(index))	//c4  
            return false;  
        visited[rowindex][colindex] = true;

        
        System.out.println(board[rowindex][colindex]);
        System.out.println("rowindex="+rowindex);
        System.out.println("colindex="+colindex);
        System.out.println();
        
        //line 37
        boolean res = dfs(board, word, index + 1, rowindex - 1, colindex,  
                visited)  
                || dfs(board, word, index + 1, rowindex + 1, colindex, visited)  
                || dfs(board, word, index + 1, rowindex, colindex + 1, visited)  
                || dfs(board, word, index + 1, rowindex, colindex - 1, visited);  
       visited[rowindex][colindex] = false;  //why? Since the visited result is unknown for the most out loop's each iteration
        return res;  
    }
    
    public static void main(String args[]){
    	char [][] board={{'C','A','A'},{'A','A','A'},{'B','C','D'}};
    	String word="CAB";
    	System.out.println(new solution().exist(board, word));
    }
}
