package Problems;

import helper.ArrayHelpers;
import java.util.Arrays;

public class LeetCode2028 {

    public static void run(){
        ArrayHelpers.printArray(missingRolls(new int[]{1,5,6},3,4));
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        for(int roll:rolls)sum+=roll;
        int sumOfNRolls = mean * (rolls.length + n ) - sum;
        if(sumOfNRolls<n || sumOfNRolls>6*n) return new int[0];
        int[] missingRollsArr = new int[n];
        int distributeMean = sumOfNRolls / n;
        int mod = sumOfNRolls % n;
        Arrays.fill(missingRollsArr, distributeMean);
        for (int i = 0; i < mod; i++) {
            missingRollsArr[i]++;
        }
        return missingRollsArr;
    }
}
