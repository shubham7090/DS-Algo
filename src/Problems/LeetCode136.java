package Problems;

public class LeetCode136 {

    public static void run(){
        int[] nums = {1,1,2,3,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ans =0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
    }
}
