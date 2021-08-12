import java.io.*;
import java.util.*;

public class nextGreaterElementRight{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve 
   //Approch 1
   int[] ans=new int[arr.length];
   ans[arr.length-1]=-1;
   LinkedList<Integer> st=new LinkedList<>();
   st.add(arr[arr.length-1]);
   for(int i=arr.length-2;i>=0;i--){
       while(st.size()>0&&arr[i]>st.getLast())st.removeLast();
       if(st.size()>0)ans[i]=st.getLast();
       else ans[i]=-1;
       st.add(arr[i]);
   }
   public static int[] solve2(int[] arr){
    // solve 
    //Approch 2
    int[] ans=new int[arr.length];
    ans[arr.length-1]=-1;
    LinkedList<Integer> st=new LinkedList<>();
    st.add(arr[arr.length-1]);
    for(int i=arr.length-2;i>=0;i--){
        while(st.size()>0&&arr[i]>st.getLast())st.removeLast();
        if(st.size()>0)ans[i]=st.getLast();
        else ans[i]=-1;
        st.add(arr[i]);
    }
   
   
   
   return ans;
 }

}