package Problems;

public class LeetCode1945 {
    public static void run(){
        System.out.println(getLucky("leetcode",2));
    }

    public static int getLucky(String s, int k) {
        int sum=0;
        for(char ch:s.toCharArray()){
            sum+= sumOfDigits(ch-'a'+1);
        }
        while(k-->1)sum=sumOfDigits(sum);
        return sum;
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
