package org.example.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class silver_2178 {
    static char[][] miro;
    //static boolean[][] visit;

    static List<Integer> result = new ArrayList<>();
    //미로탐색
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] visit = new boolean[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                visit[i][j] = false;
            }
        }
        miro = new char[n][m];
        for(int i=0;i<n;i++){
            String row = br.readLine();
            char[] row_ch = row.toCharArray();
            miro[i] = row_ch;
        }

/*        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(miro[i][j]);
            }
            System.out.println();
        }*/
        go(0,0,0, visit);

        int answer=100000;
        for (int rslt : result){
            //System.out.println(rslt);
            if(rslt < answer) answer= rslt;
        }

        System.out.println(answer);

    }
    public static void go(int n, int m, int cnt, boolean[][] visit){

        //예제입력2에서 n:2,m:3 에 왔을때 visited[2][4]는 false 여야 하는데 자꾸 true로 되있음.
        //아마 배열을 그대로 복사하면 주소가 복사되어 지역변수로 사용이 안되는 특성이 있나봄.
        boolean[][] tmp_visit =new boolean[visit.length][visit[0].length];
        for(int i=0;i< visit.length;i++){
            for (int j=0;j< visit[0].length;j++){
                tmp_visit[i][j]= visit[i][j];
            }
        }
        if(n == miro.length-1 && m ==miro[0].length-1){
            cnt++;
            result.add(cnt);
            return;
        }

        cnt ++;
        tmp_visit[n][m] = true;


        int[] direct_y = {-1,0,1,0};
        int[] direct_x = {0,1,0,-1};
        for(int i=0;i<4;i++){

            int tmp_n = n+direct_y[i];
            int tmp_m = m+direct_x[i];

            if(tmp_n<= miro.length-1 &&0<=tmp_n&& tmp_m<= miro[0].length-1&& 0<=tmp_m && tmp_visit[tmp_n][tmp_m]==false&&miro[tmp_n][tmp_m] == '1'){

                go(tmp_n,tmp_m,cnt,tmp_visit);
            }
        }
        return;
    }
}
