package Problems;

public class LeetCode461 {
    public static void run(){
        System.out.println(hammingDistance(1,4));
    }

    public static int hammingDistance(int x, int y) {
        //number of bits in the xor

        int num = x^y;

        int count=0;
        while(num>0){
            int rightMostSetBit = num&(-1*num);
            num-=rightMostSetBit;
            count++;
        }
        return count;
    }
}
