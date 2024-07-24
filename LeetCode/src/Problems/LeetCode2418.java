package Problems;

import helper.ArrayHelpers;

import java.util.Collections;
import java.util.*;

public class LeetCode2418 {
    public static void run(){
        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};
        ArrayHelpers.printArray(sortPeople(names,heights));
    }

    private static String[] sortPeople(String[] names, int[] heights) {
        List<Pair<String, Integer>> ans = new ArrayList<>();
        for(int i=0;i<heights.length;i++){
            ans.add(new Pair<String,Integer>(names[i],heights[i]));
        }
        Collections.sort(ans,Comparator.comparing(Pair<String,Integer> :: getValue).reversed());
        for(int i=0;i<heights.length;i++){
            names[i]= ans.get(i).getKey().toString();
        }
        return names;
    }

    private static class Pair<T,V>{
        T key;
        V value;

        Pair(T key,V value){
            this.key=key;
            this.value=value;
        }
        public T getKey(){return this.key;}
        public V getValue(){return this.value;}
    }
}

