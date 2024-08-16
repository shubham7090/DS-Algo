package Problems;

public class LeetCode191 {
    public static void run(){
        System.out.println(hammingWeight(9));
    }

    public static int hammingWeight(int num) {
        int count=0;
        while(num>0){
            int rightMostSetBit = num&(-1*num);
            num-=rightMostSetBit;
            count++;
        }
        return count;
    }
}
