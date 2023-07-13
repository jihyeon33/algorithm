package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*백준 1717 집합의 표현*/  //출력은 정상이나, 오답.
public class ex1717 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] root = new int[n+1];
		ArrayList<Integer>[] list;
		list = new ArrayList[m+1];
		for(int i =1; i<=n;i++) {
			root[i]=i;
		}
		for(int i =1; i<=m ; i++) {
			list[i]= new ArrayList<Integer>();
		}
		for (int i=1; i<=m ;i++) {
			st = new StringTokenizer(br.readLine());  //다음라인을 읽을때는 st 초기화
			list[i].add(Integer.parseInt(st.nextToken()));
			list[i].add(Integer.parseInt(st.nextToken()));
			list[i].add(Integer.parseInt(st.nextToken()));
		}
/*		for(int i =0; i<=n ;i++) {
			System.out.println(root[i]);
		}		
		for(int i =0; i<=m ;i++) {
			System.out.println(list[i]);
		}*/
		for(ArrayList<Integer> li :list) {
			if(li == null) {continue;}
			if(li.get(0)==0) { //if 0 이면
				//System.out.println("union 연산을 시작합니다.");
				root = union(root, li.get(1), li.get(2));
			}else { //if 1 이면
				//System.out.println("find 연산을 시작합니다.");
				boolean rslt= find(root, li.get(1),li.get(2));
				if (rslt ==true) {System.out.println("YES");
				}else {System.out.println("NO");}
			}
		}
	}
	public static int[] union(int[] root, int a, int b) {
		if(a<b) {
			root[b]=root[a];
		}else {
			root[a]= root[b];
		}
		return root;
	}
	public static boolean find(int[] root, int a, int b) {
		boolean rslt = false;
		if(root[a]==root[b]) {
			rslt= true;
		}
		return rslt;
	}
}
