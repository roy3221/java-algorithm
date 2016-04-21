// This is the text editor interface. 
// Anything you type or change here will be seen by the other person in real time.

/*"Boggle Game"

D G H I
K L P S
Y E U T
E O R N

"IS"
"UP"
"OR"
"US"
"EYE"
"PUT"
"RUN"
"ROE"
"HIS"
"EEL"
"TURN"
"TRUE"
"TREE"
"TROY"
"SUPER"*/
import java.util.*;

public class Game{
    static boolean visited[][];
    
    
    // check next possible composition of characters is a valid word or not.
    public static void isValid (char[][] board, Set<String> Dictionary, int i, int j, String word) {
        if(i < 0 || j < 0 || i > 3 || j > 3 || visited[i][j]) return;
        visited[i][j] = true;
        String curWord = new String(word);
        curWord += Character.toString(board[i][j]);
        if(Dictionary.contains(word)) System.out.println(word);
        
        isValid(board, Dictionary, i, j+1, curWord);
        isValid(board, Dictionary, i, j-1, curWord);
        isValid(board, Dictionary, i-1, j, curWord);
        isValid(board, Dictionary, i+1, j, curWord);
        isValid(board, Dictionary, i+1, j+1, curWord);
        isValid(board, Dictionary, i-1, j-1, curWord);
        isValid(board, Dictionary, i+1, j-1, curWord);
        isValid(board, Dictionary, i-1, j+1, curWord);
        
        visited[i][j] = false;
    }
    
    public static void printValidWord(char[][] board, Set<String> Dictionary) {
        visited = new boolean[4][4];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                isValid(board, Dictionary, i, j, "");
            }
        }
    }

public static void main(String args[]) {
        char[][] board = {{'D', 'G', 'H', 'I'},
    {'K', 'L', 'P', 'S'},
    {'Y', 'E', 'U', 'T'},
    {'E', 'O', 'R', 'N'}};
    String[] str = {"IS", "UP", "OR", "US", "EYE", "TRUE", "TREE", "TROY", "SUPER"};
    Set<String> set= new HashSet<>(Arrays.asList(str));
    printValidWord(board, set);

    }
}
