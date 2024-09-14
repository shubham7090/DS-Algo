package Problems;

public class LeetCode2419 {
    public static void run(){
        System.out.println(longestSubarray(new int[]{9,99,9,9,9,10,99,99}));
    }

    public static int longestSubarray(int[] nums) {
        int max = -1;
        int ansStreak =0;
        int currStreak=0;
        for(int num:nums){
            if(max<num){
                max = num;
                currStreak = 1;
                ansStreak=0;
            }else if(max==num)currStreak++;
            else currStreak = 0;

            ansStreak = Math.max(ansStreak,currStreak);
        }
        return ansStreak;
    }
}
