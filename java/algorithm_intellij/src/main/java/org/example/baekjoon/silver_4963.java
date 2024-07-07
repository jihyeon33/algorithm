package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class silver_4963 {

    static List<Integer> result = new ArrayList<>();
    static int[][] matrix;
    static int[][] visited;

    //섬의 개수   : 정답 성공!!
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            if(width==0 && height ==0){
                break;
            }

            inputGraph(width, height,br);
        }


        //결과 출력
        for(int rslt: result){
            System.out.println(rslt);
        }

    }
    public static void inputGraph(int width, int height, BufferedReader br) throws IOException {
        matrix = new int[height][width];
        visited = new int[height][width];

        //Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<height;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0; j<width;j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
                visited[i][j] = 0;
            }
        }

/*        System.out.println("matrix");
        for(int i =0; i<matrix.length;i++){
            int[] row = matrix[i];
            for (int j=0;j<row.length;j++){
                System.out.print(row[j]+" ");
            }
            System.out.println();
        }
        System.out.println("visited");
        for(int i =0; i<visited.length;i++){
            int[] row = visited[i];
            for (int j=0;j<row.length;j++){
                System.out.print(row[j]+" ");
            }
            System.out.println();
        }*/

        countSum();


    }
    public static void countSum(){
        int cnt =0;
        for(int i=0;i<matrix.length;i++){
            int[] row = matrix[i];
            for (int j=0;j<row.length;j++){
                if(go(i,j,false)==true){
                    cnt++;
                }

/*                System.out.println("cnt : "+cnt);
                System.out.println("matrix");
                for(int a =0; a<matrix.length;a++){
                    int[] rw = matrix[a];
                    for (int b=0;b<rw.length;b++){
                        System.out.print(rw[b]+" ");
                    }
                    System.out.println();
                }
                System.out.println("visited");
                for(int a =0; a<visited.length;a++){
                    int[] rw = visited[a];
                    for (int b=0;b<rw.length;b++){
                        System.out.print(rw[b]+" ");
                    }
                    System.out.println();
                }*/

            }
        }

        result.add(cnt);
    }
    public static boolean go(int i, int j,boolean cnt){
        int[] direct_y={0,-1,-1,-1,0,+1,+1,+1};
        int[] direct_x={-1,-1,0,+1,+1,+1,0,-1};
        if(visited[i][j]==0 && matrix[i][j]==1){
            cnt=true;
            visited[i][j]=1;
            for(int k=0;k<8;k++){
                if(i+direct_y[k]>=0 && j+direct_x[k]>=0 && i+direct_y[k]<matrix.length && j+direct_x[k] <matrix[0].length){
                    go(i+direct_y[k],j+direct_x[k],cnt);
                }
            }
        }
        return cnt;
    }
}
