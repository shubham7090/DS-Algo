import java.io.*;
import java.util.*;

public class nextGreaterElementII {
    public static int[] nextGreaterElementII(int[] arr) {
        int[] ans=new int[arr.length];
        LinkedList<Integer> st=new LinkedList<Integer>();
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0&&arr[i]>st.getLast())st.removeLast();
            st.add(arr[i]);
        }
        for(int i=arr.length-1;i>=0;i--){
            
            while(st.size()>0&&arr[i]>=st.getLast())st.removeLast();
            if(st.size()==0)ans[i]=-1;
            else ans[i]=st.getLast();
            
            st.add(arr[i]);
            
        }
        return ans;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(read.readLine());
        }
        
        int ans[] = nextGreaterElementII(nums);

        n = ans.length;

        System.out.println(n);
        for(int e: ans){
            System.out.println(e);
        }
        
    }
}