package Problems;

public class LeetCode202 {

    public static void run(){
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int fast = n,slow=n;

        do{
            slow = sumOfSquareOfDigits(slow);
            fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast));
        }while(slow!=fast);

        if(slow==1)return true;
        return false;
    }

    public static int sumOfSquareOfDigits(int num){
        int ans =0;
        while(num>0){
            int rem = num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}
