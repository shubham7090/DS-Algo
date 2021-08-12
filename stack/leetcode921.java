import java.io.*;
import java.util.*;

public class leetcode921 {
    public static int minAddToMakeValid(String s) {
        LinkedList<Character> st=new LinkedList<>();
     for(int i=0;i<s.length();i++){
         if(s.charAt(i)==')'&&st.size()>0&&st.getLast()=='('){
             st.removeLast();
         }else{
             st.add(s.charAt(i));
         }
     }
    return st.size();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int result = minAddToMakeValid(read.readLine());
        System.out.println(result);
    }
}

