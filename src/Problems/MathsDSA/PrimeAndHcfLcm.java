package Problems.MathsDSA;

public class PrimeAndHcfLcm {

    public static boolean isPrime(int num){
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimeSieveOfErathesthenes(int num){
        boolean[] isPrime = new boolean[num+1];
        for(int i=2;i<num;i++){

        }

    }

    public static int sqtBinarySearch(int num){
        return 1;
    }

    public static void allFactors(int num){
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                System.out.println(i);
                if(i!= num/i) System.out.println(num/i);
            }
        }
    }

    public static int gcd(int a, int b){
        if(a==0)return b;

        return gcd(b%a,b);
    }

    public static int lcm(int a ,int b){
        return (a*b)/gcd(a,b);
    }

}
