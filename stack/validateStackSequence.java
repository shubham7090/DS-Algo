import java.io.*;
import java.util.*;

public class validateStackSequence {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
         LinkedList<Integer> st=new LinkedList<Integer>();
    int j=0;
        for(int i=0;i<pushed.length;i++){
            st.add(pushed[i]);
            while(st.size()>0&&st.getLast()==popped[j]){
                st.removeLast();j++;
            }
        }
        while(st.size()>0&&st.getLast()==popped[j]){
            st.removeLast();j++;
        }
        return st.size()==0;
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

        int pushed [] = getArr(read.readLine());
        int popped [] = getArr(read.readLine());
        
        boolean result = validateStackSequences(pushed, popped);

        System.out.println(result);
    }
}