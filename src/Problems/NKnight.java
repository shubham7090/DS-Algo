package Problems;

import java.util.*;

public class NKnight{
    public static void run(){
        int n =4;
        boolean[][] board = new boolean[n][n];
        System.out.println(countNumberOfKnights(board,0,0,n));

    }

    public static int countNumberOfKnights(boolean[][] board, int row,int col, int knights){
        if(knights==0){
            return 1;
        }
        if(col==board[0].length){
            return countNumberOfKnights(board,row+1,0,knights);
        }
        if(row >= board.length || col >= board[0].length)return 0;
        int count =0;
        if(isSafe(board,row,col)){
            board[row][col]=true;
            count+=countNumberOfKnights(board,row,col+1,knights-1);
            board[row][col]=false;
        }
        count+=countNumberOfKnights(board,row,col+1,knights);
        return count;
    }

    public static boolean isSafe(boolean[][] board, int r,int c){
        //vertical check
        if(r-2>=0){
            if(c+1<board[0].length){
                if(board[r-2][c+1]){
                    return false;
                }
            }
            if(c-1>=0){
                if(board[r-2][c-1]){
                    return false;
                }
            }
        }
        if(r-1>=0){
            if(c+2<board[0].length){
                if(board[r-1][c+2]){
                    return false;
                }
            }
            if(c-2>=0){
                if(board[r-1][c-2]){
                    return false;
                }
            }
        }
        return true;
    }
}
