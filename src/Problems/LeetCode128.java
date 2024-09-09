package Problems;

import java.util.*;

public class LeetCode128 {

    public static void run(){
        System.out.println(longestConsecutive(new int[]{3,100,4,200,1,2}));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans =0;
        for(int num:nums)set.add(num);
        for(Integer i:set){
            if(!set.contains(i-1)){
                int cnt = 1;
                while(set.contains(i+1)){
                    cnt++;i++;
                }
                ans = Math.max(cnt,ans);
            }
        }
        return ans;
    }
}
