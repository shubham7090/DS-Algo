package Problems;

import helper.ArrayHelpers;

import java.util.*;

public class LeetCode2191 {

    public static void run(){
        int[] mapping = {8,9,4,0,2,1,3,5,7,6}, nums = {991,338,38};
        ArrayHelpers.printArray(sortJumbled(mapping,nums));
    }
    private static int[] sortJumbled(int[] mapping, int[] nums) {
        Pair[] mapped = new Pair[nums.length];
        for(int i=0;i<nums.length;i++){
            Pair pair = new Pair(convert(mapping,nums[i]),i);
            mapped[i]=pair;
        }

        Arrays.sort(mapped,(p1, p2)->{
            if(p1.num==p2.num)return Integer.compare(p1.idx,p2.idx);
            return Integer.compare(p1.num,p2.num);
        });

        int[] ans = new int[nums.length];
        for(int i=0;i<mapped.length;i++){
            ans[i]=nums[mapped[i].idx];
        }
        return ans;
    }
    private static int convert(int[] mapping,int num){
        if(num<10){
            return mapping[num];
        }
        int temp = num;
        int idx =1;
        int ans=0;
        while(temp>0){
            int digit = temp%10;
            ans = mapping[digit]*idx+ans;
            idx*=10;
            temp=temp/10;
        }
        return ans;
    }

    private static class Pair{
        public Integer num;
        public Integer idx;
        Pair(int num,int idx){
            this.num=num;
            this.idx=idx;
        }
    }


}