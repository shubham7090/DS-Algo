package Problems;

public class LeetCode2220 {
    public static void run(){
        System.out.println(minBitFlips(10,7));
    }
    public static int minBitFlips(int start, int goal) {
        //number of integer in xor of elements
        int num = start^goal;
        int count = 0;
        while(num>0){
            int leatSignificantBit = num&(-1*num);
            count++;
            num-=leatSignificantBit;
        }
        return count;
    }
}
