package DSA.Algorithm.Backtracking;
// sudoku solver.

import java.util.IllegalFormatCodePointException;

public class Q9 {

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '4', '6', '7', '8', '9', '1', '2'},
                {'6', '7', '2', '1', '9', '5', '3', '4', '8'},
                {'1', '9', '8', '3', '4', '2', '5', '6', '7'},
                {'8', '5', '9', '7', '6', '1', '4', '2', '3'},
                {'4', '2', '6', '8', '5', '3', '7', '9', '1'},
                {'7', '1', '3', '9', '2', '4', '8', '5', '6'},
                {'9', '6', '1', '5', '3', '7', '2', '8', '4'},
                {'2', '8', '7', '4', '1', '9', '6', '3', '5'},
                {'3', '4', '5', '2', '8', '6', '1', '7', '9'}
        };

        helper(board,0,0);

        for (int i =0 ;i< board.length;i++){
            for (int j = 0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int nrow, ncol;
        if (col == board[0].length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            for (char num = '1'; num <= '9'; num++) {
                if (isSafe(board, row, col, num)) {
                    board[row][col] = num;
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.'; // Backtracking
                    }
                }
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col, char number) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == number || board[row][i] == number) {
                return false;
            }
        }

        int subgridStartRow = 3 * (row / 3);
        int subgridStartCol = 3 * (col / 3);
        for (int i = subgridStartRow; i < subgridStartRow + 3; i++) {
            for (int j = subgridStartCol; j < subgridStartCol + 3; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }

        return true;
    }

}

