package Problems;

import helper.ArrayHelpers;
import java.util.*;

public class LeetCode912 {
    public static void run (){
        int[] arr = {1,2,4,2,88,33,44,77,21,90,43,78,32,8,65,434,43,44,4,60};
        ArrayHelpers.printArray(mergeSort(arr));
        mergeSortInplace(arr,0,arr.length);
        ArrayHelpers.printArray(arr);
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length<=1){return arr;}
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,arr.length/2));
        int[] right = mergeSort(Arrays.copyOfRange(arr,arr.length/2,arr.length));

        //merging 2 sorted array
        int[] mySort=new int[arr.length];
        int leftPr =0,rightPr=0,mySortPr=0;

        while(leftPr<left.length&&rightPr<right.length){
            if(left[leftPr]<right[rightPr]){
                mySort[mySortPr] = left[leftPr];
                leftPr++;
            }else{
                mySort[mySortPr] = right[rightPr];
                rightPr++;
            }
            mySortPr++;
        }

        while(leftPr<left.length){
            mySort[mySortPr] = left[leftPr];
            leftPr++;
            mySortPr++;
        }

        while(rightPr<right.length){
            mySort[mySortPr] = right[rightPr];
            rightPr++;
            mySortPr++;
        }
        return mySort;
    }

    public static void mergeSortInplace(int[] arr,int st,int end){
        if(end-st ==1){return;}
        int mid = st + (end-st)/2;
        mergeSortInplace(arr,st,mid);
        mergeSortInplace(arr,mid,end);

        //merging 2 sorted array
        int[] mySort=new int[end-st];
        int leftPr =st,rightPr=mid,mySortPr=0;

        while(leftPr<mid&&rightPr<end){
            if(arr[leftPr]<arr[rightPr]){
                mySort[mySortPr] = arr[leftPr];
                leftPr++;
            }else{
                mySort[mySortPr] = arr[rightPr];
                rightPr++;
            }
            mySortPr++;
        }

        while(leftPr<mid){
            mySort[mySortPr] = arr[leftPr];
            leftPr++;
            mySortPr++;
        }

        while(rightPr<end){
            mySort[mySortPr] = arr[rightPr];
            rightPr++;
            mySortPr++;
        }

        for(int i=0;i<mySort .length;i++){
            arr[st+i]=mySort[i];
        }
    }

}
