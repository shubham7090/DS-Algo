import java.io.*;
import java.util.*;

public class nextGreaterElementLeft {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] ngl = solve(a);
    display(ngl);
  }

  public static int[] solve(int[] arr) {
    // solve
    int[] ans=new int[arr.length];
    LinkedList<Integer> st=new LinkedList<Integer>();
    ans[0]=-1;
    st.add(arr[0]);
    for(int i=1;i<arr.length;i++){
        while(st.size()>0&&arr[i]>st.getLast())st.removeLast();
        if(st.size()==0)ans[i]=-1;
        else ans[i]=st.getLast();
        st.add(arr[i]);
    }
    return ans;
  }

}