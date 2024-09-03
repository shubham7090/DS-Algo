package Problems;

import helper.ArrayHelpers;

public class LeetCode260 {

    public static void run(){
        ArrayHelpers.printArray(singleNumber(new int[]{1,1,2,2,3,4,4,5,5,6}));
    }

    public static int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums)xor^=num;

        int rightMostSetBit = xor&(-1*xor);
        int first = 0 ;
        int second = 0;

        for(int num:nums){
            if((num&rightMostSetBit)==0)first^=num;
            else second^=num;
        }

        return new int[]{first,second};
    }
}
