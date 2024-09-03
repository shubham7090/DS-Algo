package Problems;

import helper.ArrayHelpers;

public class LeetCode1894 {

    public static void run(){
        System.out.println(chalkReplacer(new int[]{3,4,1,2},25));
    }

    public static int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i:chalk)sum+=i;
        k%=sum;int ans=-1;
        for(int i=0;i<chalk.length;i++){
            if(k<chalk[i]){
                ans=i;
                break;
            }
            k-=chalk[i];
        }
        return ans;
    }
}
