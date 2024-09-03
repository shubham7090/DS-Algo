package Problems;

import helper.ArrayHelpers;

public class LeetCode2022 {

    public static void run(){
        ArrayHelpers.printArray(construct2DArray(new int[]{1,2,3,4},2,2));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(n*m!=original.length)return new int[0][0];
        int[][] arr  = new int[m][n];
        for (int i=0,k=0;i<m;i++)
            for(int j=0;j<n;j++,k++)arr[i][j]=original[k];

        return arr;
    }

}
