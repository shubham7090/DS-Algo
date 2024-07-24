package Problems;

import helper.ArrayHelpers;

import java.util.*;

public class LeetCode1636 {

    public static void run(){
        int[] nums = {1,1,1,2,3,2,2,2,2};
        ArrayHelpers.printArray(frequencySort(nums));
    }

    private static int[] frequencySort(int[] nums) {
        Integer[] number = new Integer[nums.length];
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            number[i] = nums[i];
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }

        Arrays.sort(number,(idx1, idx2) -> {

                    if(freq.get(idx1).equals(freq.get(idx2)))
                        return Integer.compare(idx2, idx1);
                    else return Integer.compare(freq.get(idx1),freq.get(idx2));
                }
        );
        for(int i=0;i<nums.length;i++){
            nums[i] = number[i];
        }
        return nums;

    }
}
