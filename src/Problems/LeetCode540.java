package Problems;

import helper.ArrayHelpers;

public class LeetCode540 {

    public static void run(){
        System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }

    public static int singleNonDuplicate(int[] nums) {
        int mid=0;
        int strt =0,end=nums.length-1;
        while(strt<=end){
            mid = strt + (end -strt)/2;
            if(mid%2==0){
                if(mid+1<nums.length && nums[mid]==nums[mid+1]){
                    strt = mid+2;
                }else if(mid-1>=0 && nums[mid]==nums[mid-1])end=mid-2;
                else break;
            }else{
                if(mid-1>=0 && nums[mid]==nums[mid-1]){
                    strt = mid+1;
                }else if(mid+1<nums.length && nums[mid]==nums[mid+1]){
                    end = mid - 1;
                }else break;
            }
        }
        return nums[mid];
    }
}
