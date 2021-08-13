import java.io.*;
import java.util.*;

public class ScoreParentheses {
    public static int scoreOfParentheses(String str) {
        LinkedList<Integer> st=new LinkedList<>();
        //0 for )
        //-1 for (
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(')st.add(-1);
            else{
                if(st.getLast()==-1){
                    st.removeLast();
                    st.add(1);
                }
                else{
                    int sum=0;
                    while(st.getLast()!=-1){
                        sum+=st.removeLast();
                    }
                    st.removeLast();
                    st.add(2*sum);
                }
            }
        }
        int sum=0;
        while(st.size()>0){
            sum+=st.removeLast();
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int score = scoreOfParentheses(read.readLine());
        System.out.println(score);
        
    }
}
