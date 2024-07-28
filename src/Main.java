import Problems.BitwiseOperators.BitwiseOperations;
import Problems.LeetCode1636;
import Problems.LeetCode2191;
import Problems.LeetCode2418;
import Problems.LeetCode912;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LeetCode2418.run();
        LeetCode1636.run();
        LeetCode2191.run();
        LeetCode912.run();
        System.out.println(BitwiseOperations.decimalToBase(1524,2));
        System.out.println(BitwiseOperations.anyBaseToDecimal("10111110100",2));
        System.out.println((BitwiseOperations.anyBasetoAnyBase(2,"10111110100",8)));
        System.out.println(BitwiseOperations.numberOfSetBits(1524));
        System.out.println(BitwiseOperations.power(3,7));
    }
}