package Problems;

import helper.ArrayHelpers;

public class LeetCode1720 {

    public static void run(){
        int[] encoded = {6,2,7,3};
        ArrayHelpers.printArray(decode(encoded,4));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0]=first;
        for(int i= 1;i<arr.length;i++){
            arr[i]=encoded[i-1]^arr[i-1];
        }
        return arr;
    }
}
