package Problems.MathsDSA;

import java.util.ArrayList;
import java.util.List;

public class PrimeAndHcfLcm {

    public static boolean isPrime(int num){
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static int[] printPrimeSieveOfErathesthenes(int num){
        List<Integer> primes= new ArrayList<Integer>();
        boolean[] arr = new boolean[num+1];
        for(int i=2;i<=num;i++){
            if(!arr[i]){
                for(int j= i+i;j<=num;j+=i){
                    arr[j]=true;
                }
            }
        }
        for(int i = 2;i<=num;i++){
            if(!arr[i]){
                primes.add(i);
            }
        }
        int[] ansPrime = new int[primes.size()];
        for(int i=0;i<primes.size();i++){
            ansPrime[i]=primes.get(i);
        }
        return ansPrime;

    }

    public static int sqtBinarySearch(int num){
        int strt = 1,end=num;
        int result = num;
        while(strt<=end){
            int mid = strt + (end-strt)/2;
            if(mid*mid<=num){
                result = mid;
                strt=mid+1;
            }else if(mid*mid>num){
                end=mid-1;
            }
        }
        return result;
    }

    public static void allFactors(int num){
        for(int i=1;i*i<num;i++){
            if(num%i==0){
                System.out.print(i + ", ");
                if(i!= num/i) System.out.print(num/i+", ");
            }
        }
        System.out.println();
    }

    public static int gcd(int a, int b){
        if(a==0)return b;

        return gcd(b%a,a);
    }

    public static int lcm(int a ,int b){
        return (a*b)/gcd(a,b);
    }

}
