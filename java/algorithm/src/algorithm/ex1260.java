package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

/*백준1260*/
public class ex1260 {
	public static ArrayList<Integer> rslt = new ArrayList<Integer>();
	public static Stack<Integer> stack = new Stack<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		List<Integer>[] gp = new ArrayList[n+1]; 
		boolean[] visit =new boolean[n+1];
		for(int i=1;i<=n;i++) {
			visit[i]=false;
		}
		for(int i=1;i<=n;i++) {
			gp[i]= new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			gp[s].add(e);
			gp[e].add(s);
		}
		for(int i=1;i<=n;i++) {
			Collections.sort(gp[i],Collections.reverseOrder());
		}
		visit[v]=true;
		rslt.add(v);
		rslt = dfs(gp,visit,v);
		for(int r:rslt) {
			System.out.println(r);
		}
	}
	//스택
	public static ArrayList<Integer> dfs(List<Integer>[] gp, boolean[] visit, int v) {
		for(int x: gp[v]) {
			if(visit[x]!=true) {stack.push(x);}
		}
		while(!stack.isEmpty()) {
			int y =stack.pop();
			visit[y]=true;
			rslt.add(y);
			dfs(gp,visit,y);			
		}
		return rslt;
	}
	//큐
	public static int[] bfs(List<Integer>[] gp, boolean[] visit, int v) {
		return null;
	}
}
