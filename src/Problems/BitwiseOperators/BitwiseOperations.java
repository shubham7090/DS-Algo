package Problems.BitwiseOperators;

public class BitwiseOperations {

    public static long anyBaseToDecimal(String num,int base){
        long multiplier = 1;
        long decimal = 0;
        for(int i=num.length()-1;i>=0;i--){
            int digit = num.charAt(i)-'0';
            decimal+=digit*multiplier;
            multiplier*=base;
        }
        return decimal;
    }

    //divide the number by base and reverse the remainders
    public static String decimalToBase(long num,int base){
        StringBuilder sb= new StringBuilder();
        while(num>0){
            int digit = (int)(num%base);
            if(digit<=9){
                sb.append(digit);
            }else{
                sb.append((char)('a'+digit));
            }
            num/=base;
        }
        return sb.reverse().toString();
    }

    public static String anyBasetoAnyBase(int initialBase,String num,int finalBase){
        long decimal = anyBaseToDecimal(num,initialBase);
        return decimalToBase(decimal,finalBase);
    }

    public static int numberOfSetBits(int num){
        int count=0;
        while(num>0){
            int rightMostSetBit = leastSignificantBit(num);
            num-=rightMostSetBit;
            count++;
        }
        return count;
    }

    public static int leastSignificantBit(int num){
        return num&(-1*num);
    }

    public static long power(long base,int pow){
        long ans = 1;
        while(pow>0){
            if((pow&1)==1){
                ans*=base;
            }
            base*=base;
            pow>>=1;
        }
        return ans;
    }
}
