package backtracking;

public class Word_Search {
	public boolean exist(char[][] board, String word) {
        boolean visited[][] = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++){
            for ( int j = 0; j < board[0].length; j++){
                if ( board[i][j] == word.charAt(0) && check (board, word, 0,i, j, visited))
                    return true;
            }
        }
        return false;
    } 
    
    private boolean check(char[][] board, String word, int index, int i, int j, boolean[][] visited) {
            if (index == word.length())
                return true;
            if (i >= board.length || j >= board[0].length || i < 0 || j < 0 || visited[i][j] || board[i][j] != word.charAt(index))
                return false;
            visited[i][j] = true;
            if (check(board, word, index+1, i+1,j, visited) ||
                 check(board, word, index+1, i, j+1, visited) || 
                 check(board, word, index+1, i-1, j, visited) || 
                 check(board, word, index+1, i, j-1, visited)) {
                    return true;
                 }
            
            visited[i][j] = false;
            return false;
        }

}
