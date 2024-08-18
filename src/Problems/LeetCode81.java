package Problems;

public class LeetCode81 {

    public static void run(){
        System.out.println(search(new int[]{4,5,6,7,0,1,2},0));
    }

    public static boolean search(int[] nums, int target) {
        int start = 0,end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target)return true;
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start = start + 1;
                end = end - 1;
                continue;
            }
            else if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<nums[mid]) end = mid-1;
                else start = mid+1;
            }else{
                if(nums[mid]<target && target<=nums[end]) start = mid+1;
                else end = mid-1;
            }
        }
        return false;
    }
}
