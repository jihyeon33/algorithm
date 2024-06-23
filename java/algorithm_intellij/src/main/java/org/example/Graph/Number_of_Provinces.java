package org.example.Graph;

import java.util.ArrayList;
import java.util.List;

public class Number_of_Provinces {
/*
Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2*/

/*
Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3*/

    private static List<Integer> graph = new ArrayList<>();

    public int findCircleNum(int[][] isConnected) {
        int rslt =0;
        setGraph(isConnected);
        return rslt;
    }
    public void setGraph(int[][] isConnected){

    }

    public int findRoot(int a){
        int root = a;

        return root;

    }
}
