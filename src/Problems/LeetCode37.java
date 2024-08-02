package Problems;

import helper.ArrayHelpers;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class LeetCode37{
    public static void run(){
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        sudokuSolver(board,0,0);
    }

    public static void sudokuSolver(int[][] board,int row,int col){
        if(row>board.length){
            return;
        }
        if(row==board.length && col==board[0].length){
            ArrayHelpers.print2DArray(board);
            return;
        }
        if(col==board[0].length){
            sudokuSolver(board,row+1,0);
            return;
        }
        if(row==board.length){
            return;
        }
        System.out.println(row+" "+col);
        if(board[row][col]!=0){
            sudokuSolver(board,row,col+1);
            return;
        }
        for(int i=1;i<=9;i++){
            if(isSafe(board,row,col,i)){
                board[row][col] = i;
                sudokuSolver(board,row,col+1);
                board[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int[][] board, int r, int c, int num){
        //entire col
        for(int i=0;i<board.length;i++){
            if(board[i][c]==num){
                return false;
            }
        }

        //entire row
        for(int i=0;i<board[0].length;i++){
            if(board[r][i]==num){
                return false;
            }
        }

        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = r-(r%sqrt);
        int colStart = c-(c%sqrt);

        for(int i=rowStart;i<rowStart+sqrt;i++){
            for(int j=colStart;j<colStart+sqrt;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }

        return true;
    }
}