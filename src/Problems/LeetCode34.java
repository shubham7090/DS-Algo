package Problems;

import helper.ArrayHelpers;

public class LeetCode34 {

    public static void run(){
        ArrayHelpers.printArray(searchRange(new int[]{5,7,7,8,8,10},8));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }else if (nums[mid]>target){
                end = mid-1;
            }else{
                ans[0]=mid;
                end = mid-1;
            }
        }
        start = 0;
        end = nums.length-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }else if (nums[mid]>target){
                end = mid-1;
            }else{
                ans[1]=mid;
                start = mid+1;
            }
        }

        return ans;
    }
}
