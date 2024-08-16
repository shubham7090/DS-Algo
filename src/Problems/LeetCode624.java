package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode624 {

    public static void run(){
        List<List<Integer>> arrays = new ArrayList<>();
        Integer[] arr = {1,2,3,10};
        arrays.add(Arrays.asList(arr));
        Integer[] arr1 = {4,8};
        arrays.add(Arrays.asList(arr1));
        System.out.println(maxDistance(arrays));
    }

    public static int maxDistance(List<List<Integer>> arrays) {
        int smallest = arrays.get(0).get(0);
        int biggest = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            maxDistance = Math.max(maxDistance, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - smallest));
            maxDistance = Math.max(maxDistance, Math.abs(biggest - arrays.get(i).get(0)));
            smallest = Math.min(smallest, arrays.get(i).get(0));
            biggest = Math.max(biggest, arrays.get(i).get(arrays.get(i).size() - 1));
        }

        return maxDistance;
    }
}
