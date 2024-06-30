package org.example.leetcode.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Smallest_String_with_Swaps {
    public static void main(String[] args) {
        String s = "dcab";
        List<List<Integer>> pairs =new ArrayList<>();
        pairs.add(new ArrayList<>(Arrays.asList(0,3)));
        pairs.add(new ArrayList<>(Arrays.asList(1,2)));
        smallestStringWithSwaps(s,pairs);

    }

    public static String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        char[] chars = s.toCharArray();
        for(List<Integer> swap :pairs){
            char tmp = chars[swap.get(0)];

            chars[swap.get(0)] = chars[swap.get(1)];
            chars[swap.get(1)] = tmp;
        }

        String result = new String(chars);

        System.out.println(result);
        return result;

    }
}
