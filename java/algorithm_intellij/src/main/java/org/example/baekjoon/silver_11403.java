package org.example.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class silver_11403 {
    static int[][] result;
    static List<List<Integer>> graph = new ArrayList<>();
    //경로 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        result = new int[n][n];
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                int yn = sc.nextInt();
                if(yn ==1){
                    row.add(j);
                }
            }
            graph.add(row);
        }
/*        for (List<Integer> row:graph){
            System.out.println(row);
        }*/

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                isYn(i,j);
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void isYn(int i,int j){

        if(find(i,j)) result[i][j]=1;
    }
    //bfs

    public static boolean find(int start, int target){
        System.out.println(start+","+target+":");
        boolean rslt=false;

        List<Integer> que = new ArrayList<>();
        que.add(start);
        while (!que.isEmpty()){
            //System.out.println(que);
            int pop = que.get(0);

            if (pop == target){
                if(pop != start){
                    rslt= true;
                    break;
                }
            }


            que.remove(0);
            for (int link : graph.get(pop)){
                if(link != start){
                    que.add(link);
                }
            }
        }

        return rslt;
    }
}
