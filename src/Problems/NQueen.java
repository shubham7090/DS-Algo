package Problems;

import java.util.*;

public class NQueen{
    public static void run(){
        int n =5;
        boolean[][] board = new boolean[n][n];
        System.out.println(countNumberOfQueens(board,0));

    }

    public static int countNumberOfQueens(boolean[][] board, int row){
        if(row==board.length){
            return 1;
        }
        int count =0;
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=countNumberOfQueens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    public static boolean isSafe(boolean[][] board, int r,int c){
        //vertical check
        for(int i=r;i>=0;i--){
            if(board[i][c]){
                return false;
            }
        }
        //horizontal check
        for(int i=c;i>=0;i--){
            if(board[r][i]){
                return false;
            }
        }
        //left diagnol
        for(int i=r,j=c;i>=0&&j>=0;i--,j--){
            if(board[i][j]){
                return false;
            }
        }
        //right diagnol
        for(int i=r,j=c;i>=0&&j<board[0].length;i--,j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
}
