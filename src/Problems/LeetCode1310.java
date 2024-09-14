package Problems;

import helper.ArrayHelpers;

public class LeetCode1310 {
    public static void run(){
        ArrayHelpers.printArray(xorQueries(new int[]{4,8,2,10},new int[][]{{2,3},{1,3},{0,0},{0,3}}));
    }

    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixXor=new int[arr.length+1];
        int[] ans = new int[queries.length];
        for(int i=0;i<arr.length;i++){
            prefixXor[i+1] = prefixXor[i]^arr[i];
        }
        for(int i=0;i<queries.length;i++){
            ans[i] = prefixXor[queries[i][0]]^prefixXor[queries[i][1]+1];
        }

        return ans;

    }
}
