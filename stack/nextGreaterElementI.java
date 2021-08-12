import java.io.*;
import java.util.*;

public class Main {
    public static int[] nextGreaterElement(int[] nums, int[] query) {
        int[] nums2=nums;
        int[] nums1=query;
         LinkedList<Integer> st=new LinkedList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(st.size()>0&&nums2[i]>nums2[st.getLast()]){
                mp.put(nums2[st.removeLast()],nums2[i]);
            }
            st.add(i);
        }
        while(st.size()>0)mp.put(nums2[st.removeLast()],-1);
        
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=mp.get(nums1[i]);
        }
        return ans;
    }

    public static int[] getArr(String s){
        String nums[] = s.split(" ");
        int n = nums.length;
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = Integer.parseInt(nums[i]);
        }
        return ar;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int query[] = getArr(read.readLine());
        int nums[] = getArr(read.readLine());
        
        int ans[] = nextGreaterElement(nums, query);

        int n = ans.length;

        System.out.println(n);
        for(int e: ans){
            System.out.println(e);
        }
        
    }
}