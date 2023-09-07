package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex1991 {
	/*백준1991 트리 순회*/
	static class Node{
		String value;
		String left;
		String right;
		Node(String value, String left, String right) {
			this.value=value;
			this.left=left;
			this.right=right;
		}
	}
	static Node[] tree;
	static Deque<String> que = new LinkedList<>();
	static ArrayList<String> visit = new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		tree = new Node[n];
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			String rt = st.nextToken();
			String l = st.nextToken();
			if(l.equals(".")) {
				l = null;
			}
			String r = st.nextToken();
			if(r.equals(".")) {
				r = null;
			}
			Node node = new Node(rt,l,r);
			tree[i] = node;
		}
/*		for(int i=0; i<n;i++) {
			System.out.print(tree[i].value+","+tree[i].left+","+tree[i].right);
			System.out.println();
		}*/
		que.add("A");
		pre();
		for(int i=0;i<visit.size();i++) {
			System.out.print(visit.get(i));
		}
		
	}
	public static void pre() {
		if(que.isEmpty()) {
			return;
		}
		String a = que.pollFirst();	
		visit.add(a);
		for(Node node :tree) {
			if (node.value.equals(a)){
				String l = node.left;
				if(l != null) {que.offerLast(l);}
				String r = node.right;
				if(r != null) {que.offerLast(r);}
				break;
			}
		}
		pre();			
		return;
	}
}
