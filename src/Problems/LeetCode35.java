package Problems;

public class LeetCode35 {
    public static void run(){
        System.out.println(searchInsert(new int[]{1,3,5,6},5));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
}
