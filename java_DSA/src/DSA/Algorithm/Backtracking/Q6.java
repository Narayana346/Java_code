package DSA.Algorithm.Backtracking;
import java.util.*;
// N-queen in lexicographical sorted order .
public class Q6 {
    public static void main(String[] args) {

        System.out.println(solveNQueens(4));

    }
    public static List<List<String>> solveNQueens(int n)
    {
        //You can code here
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board,allBoards,0);
        Comparator<List<String>> myComparator = (l1, l2) ->
        {
            int comparator = 0 ;
            for(int i = 0 ; i < l1.size() ; i++)
            {
                comparator = l2.get(i).compareTo(l1.get(i)) ;
                if( comparator != 0 )
                    return comparator ;
            }
            return 0 ;
        } ;
        Collections.sort(allBoards, myComparator) ;
        return allBoards;
    }
    public static void helper(char[][] board,List<List<String>> allBoards,int col){
        if(col == board.length){
            saveBoard(board,allBoards);
        }
        for (int row = 0;row< board.length;row++){
            if (isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board,allBoards,col+1);
                board[row][col] = '.';
            }
        }
    }
    public static boolean isSafe(int row ,int col,char[][] board){
        //horizontal
        for(int hr = 0;hr< board.length;hr++){
            if (board[row][hr] == 'Q'){
                return false;
            }
        }

        //vertical
        for (int vr = 0;vr< board[0].length;vr++){
            if (board[vr][col] == 'Q'){
                return  false;
            }
        }

        //upper left
        int r = row;
        for (int c=col;c>=0&&r>=0;c--,r--){
            if (board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right
         r = row;
        for (int c=col;c< board.length&&r>=0;c++,r--){
            if (board[r][c] == 'Q'){
                return false;
            }
        }
        //lower left
        r = row;
        for (int c=col;c>=0&&r< board.length;c--,r++){
            if (board[r][c] == 'Q'){
                return false;
            }
        }
        //lower right
        r = row;
        for (int c=col;c< board.length&&r< board.length;c++,r++){
            if (board[r][c] == 'Q'){
                return false;
            }
        }
    //final return

        return true;

    }

    public static void saveBoard(char[][] board,List<List<String>> allBoards){
        List<String> add = new ArrayList<>();
        String row;
        for (int i = 0;i< board.length;i++){
            row = "";
            for (int j = 0;j< board[0].length;j++){
                if (board[i][j] == 'Q'){
                    row += 'Q';
                }else {
                    row += '.';
                }
            }
            add.add(row);
        }

        allBoards.add(add);
    }

}
