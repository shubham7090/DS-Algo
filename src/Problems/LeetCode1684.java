package Problems;

public class LeetCode1684 {
    public static void run(){
        System.out.println("LeetCode1684");
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int freq = 0;
        for(char c : allowed.toCharArray()){
            freq|=1<<(c-'a');
        }
        int res = words.length;
        for(String word: words){
            for(char c : word.toCharArray()){
                if((freq & 1<<(c-'a'))==0){
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}
