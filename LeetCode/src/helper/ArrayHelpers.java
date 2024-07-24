package helper;

public class ArrayHelpers{

    public static void printArray(String[] arr){
        System.out.print("[");
        for(String str:arr){
            System.out.print(str+",");
        }
        System.out.println("]");
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int num:arr){
            System.out.print(num+",");
        }
        System.out.println("]");
    }
}
