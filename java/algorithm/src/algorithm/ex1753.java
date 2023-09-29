package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

/*백준1753 최단경로 출력정상, 런타임에러*/
public class ex1753 {
	public static int strt;
	public static ArrayList<ArrayList<int[]>> gp = new ArrayList<>();
	public static Stack<int[]> stack = new Stack<int[]>();
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		strt = sc.nextInt();
		int[] dp = new int[n+1];
		boolean[] visited = new boolean[n+1];
		for(int i=0;i<=n;i++) {
			visited[i]=false;
		}
		for(int i=0;i<=n;i++) {
			gp.add(new ArrayList<int[]>());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i=0;i<e;i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int[] net = {v,w};
			gp.get(u).add(net);
		}
/*		System.out.println("여기서부터");
		for(int i=0;i<=n;i++) {
			for(int[] t:gp.get(i)) {
				System.out.print(t[0]);
				System.out.print(" ");
				System.out.print(t[1]);
				System.out.print(",");
			}
			System.out.println("");
		}*/
		if(gp.get(strt).size() !=0) {
			for(int[] o: gp.get(strt)) {
				int v =o[0];
				int w =o[1];
				dp[v]=w;
				visited[v]=true;
				stack.push(o);
			}
			while(!stack.isEmpty()) {
				int[] pop = stack.pop();
				int u = pop[0];
				if(gp.get(u).size()!=0) {
					for(int[] next: gp.get(u)) {
						int v = next[0];
						int w = next[1];
						if(visited[v]==false) {
							dp[v]=dp[u]+w;
						}else {
							dp[v]=Math.min(dp[v], dp[u]+w);
						}
						visited[v]=true;
					}					
				}else {
					for(int i=1;i<=n;i++) {
						if(visited[i]==false) {
							dp[i]=0;
						}						
					}
				}
			}			
		}else {
			for(int i=1;i<=n;i++) {
				dp[i]=0;
			}
		}

		for(int i=1;i<=n;i++) {
			if(dp[i]==0) {
				if(i==strt) {
					System.out.println(0);
				}else {
					System.out.println("INF");
				}
			}else {
				System.out.println(dp[i]);
			}
		}
	}
}
