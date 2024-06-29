package org.example.leetcode.Graph;

import java.util.ArrayList;
import java.util.List;

public class Number_of_Provinces {
/*
Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2*/

/*
Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3*/

    private static List<List<Integer>> graph = new ArrayList<>();
    private static List<Integer> root = new ArrayList<>();

    public static void main( String[] args ) {
        int[][]isConnected ={{1,1,0},{1,1,0},{0,0,1}};
        findCircleNum(isConnected);

    }
    public static int findCircleNum(int[][] isConnected) {
        int rslt =0;
        setGraph(isConnected);
        setRoot(graph);
        rslt =countProvinces(root);

        return rslt;
    }
    //그래프를 세팅
    public static void setGraph(int[][] isConnected){
        for(int i=0; i<isConnected.length;i++){
            List<Integer> node = new ArrayList<>();
            graph.add(node);
        }

        for(int i =0 ;i<isConnected.length; i++){
            int[] node = isConnected[i];
            for(int j =0; j< node.length; j++){
                if(node[j]==1 && i!=j){
                    graph.get(i).add(j);
                }
            }
        }
        System.out.println(graph);
    }
    //각 노드의 루트를 찾아 root를 세팅
    public static void setRoot(List<List<Integer>> graph){
        for(int i=0;i<graph.size();i++){
            root.add(i);
        }
        for(int i=0;i<graph.size();i++){
            List<Integer> node = graph.get(i);
            int rt = root.get(i);
            for(int j =0; j<node.size();j++){
                rt=findRoot(root.get(i), node.get(j));
            }
            root.set(i, rt);
        }
        System.out.println(root);
    }

    //루트를 찾는 메소드
    public static int findRoot(int self, int a){
        int root = self;
        if(a<self){
            root = a;
        }
        return root;

    }
    //최종 province 의 개수 세기
    public static int countProvinces(List<Integer> root){
        int result =0;
        List<Integer> cnt = new ArrayList<>();
        for (int i=0; i<root.size();i++){
            cnt.add(0);
        }
        for (int i =0; i<root.size();i++){
            int rt = root.get(i);
            cnt.set(rt, cnt.get(rt)+1);
        }

        for (int i =0; i<root.size();i++){
            if(cnt.get(i)!= 0){
                result++;
            }
        }
        System.out.println(result);
        return result;
    }
}
