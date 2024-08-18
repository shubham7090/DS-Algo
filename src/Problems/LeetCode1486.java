package Problems;

public class LeetCode1486 {

    public static void run(){
        System.out.println(xorOperation(5,8));
    }

    public static int xorFromZero(int x) {
        if (x % 4 == 0) {
            return x;
        } else if (x % 4 == 1) {
            return 1;
        } else if (x % 4 == 2) {
            return x + 1;
        } else {
            return 0;
        }
    }
    public static int xorOperation(int n, int start) {
        int end = start + 2 * (n - 1);
        int xorRange = xorFromZero(end/2)^xorFromZero((start/2)-1);
        xorRange*=2;
        if((start&1)==1&&(n&1)==1)xorRange++;

        return xorRange;
    }
}
