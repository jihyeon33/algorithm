package org.example.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class silver_4963 {

    static List<Integer> result = new ArrayList<>();
    //섬의 개수
    public static void main(String[] args) {
        while (true){

            Scanner sc = new Scanner(System.in);
            int width = sc.nextInt();
            int height = sc.nextInt();

            if(width==0 && height ==0){
                break;
            }

            inputGraph(width, height);
        }


        //결과 출력
        for(int rslt: result){
            System.out.println(rslt);
        }

    }
    public static void inputGraph(int width, int height){
        int[][] matrix = new int[height][width];
        int[][] visited = new int[height][width];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<height;i++){

            for(int j =0; j<width;j++){
                matrix[i][j] = sc.nextInt();
                visited[i][j] = 0;
            }
        }

        System.out.println("matrix");
        for(int i =0; i<matrix.length;i++){
            int[] row = matrix[i];
            for (int j=0;j<row.length;j++){
                System.out.print(row[j]+" ");
            }
            System.out.println();
        }
        //System.out.println(matrix);
        System.out.println("visited");
        System.out.println(visited);
        //countSum(matrix, visited);


    }
    public static void countSum(int[][] matrix, int[][]visited){
        int cnt =0;

        result.add(cnt);
    }
}
