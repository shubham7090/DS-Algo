import Problems.BitwiseOperators.BitwiseOperations;
import Problems.*;
import Problems.MathsDSA.PrimeAndHcfLcm;
import helper.ArrayHelpers;

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
        ArrayHelpers.printArray(PrimeAndHcfLcm.printPrimeSieveOfErathesthenes((int)Math.sqrt(16)));
        System.out.println(PrimeAndHcfLcm.gcd(27,9));
        System.out.println(PrimeAndHcfLcm.lcm(27,9));
        System.out.println(PrimeAndHcfLcm.isPrime(17));
        PrimeAndHcfLcm.allFactors(200);
        System.out.println(PrimeAndHcfLcm.sqtBinarySearch(225));
        System.out.println("Hello");
        NQueen.run();
        NKnight.run();
        LeetCode37.run();

    }
}