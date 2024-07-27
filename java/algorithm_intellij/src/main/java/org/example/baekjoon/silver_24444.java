package org.example.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class silver_24444 {
    public static ArrayList<Integer> visited = new ArrayList<>();
    public static boolean[] check;
    public static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

/*        System.out.println(n);
        System.out.println(m);
        System.out.println(r);*/

        for(int i=0;i<=n;i++){
            List<Integer> list = new ArrayList<>();
            graph.add(list);
        }

        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

/*        for(int i=0;i<=n;i++){
            List<Integer> list = graph.get(i);
            for(int j=0;j<list.size();j++){
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }*/

    }
    public static void bfs(int start){
        List<Integer> que = new ArrayList<>();
        que.add(start);

        while (!que.isEmpty()){
            int front = que.get(0);
            visited.add(que.get(0));
            que.remove(0);  //맨앞삭제
            List<Integer> push = graph.get(front);

        }

    }
}
