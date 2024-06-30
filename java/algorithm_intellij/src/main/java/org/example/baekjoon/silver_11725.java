package org.example.baekjoon;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class silver_11725 {
    //트리의 부모 찾기

    private static List<List<Integer>> graph= new ArrayList<>();
    @Getter
    public static class Node{
        int self;
        int parent;
        List<Integer> sibling = new ArrayList<>();
        public Node(int self, Integer parent, ArrayList<Integer> siblings){
            this.self = self;
            this.parent = parent;
            this.sibling = siblings;
        }

    }
    public static class Tree{
        static Node root = new Node(1,null, new ArrayList<Integer>());
        static List<Node> nodes = new ArrayList<>();

        public static Node get_node(int find){
            for(Node node : nodes){
                if(node.getSelf() ==find){
                    return node;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        init_graph(N);
        //그래프 입력받기
        for(int i=1;i<=N-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(b);
        }
        connect_or_return(1);  //루트 1부터 시작


    }
    //초기 빈 그래프 생성
    public static void init_graph(int N){
        for(int i=0; i<=N;i++){
            List<Integer> one = new ArrayList<>();
            graph.add(one);
        }

    }
    //자식노드를 생성하여 연결하거나 리턴
    public static void connect_or_return(int parent){
        List<Integer> siblings = graph.get(parent);
        for(int sibl: siblings){
            if(!is_parent(parent,sibl)){
                Node sibl_node = new Node(sibl, parent, new ArrayList<Integer>());
                Tree.nodes.add(sibl_node);
                connect_or_return(sibl);
            }
        }
    }
    //부모노드인지 판단
    public static boolean is_parent(int a, int b){
        Node a_node= Tree.get_node(a);
        if(a_node.getParent()==b){
            return true;
        }
        return false;
    }
}
