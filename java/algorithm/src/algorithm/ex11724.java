package algorithm;
import java.util.*;

public class ex11724 {
/*백준 11724 연결요소의 개수  dfs  성공정답*/
	static ArrayList<Integer>[] gp;
	static boolean[] visted;
	static int cnt=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		gp= new ArrayList[n+1];
		visted=new boolean[n+1];
		for (int i=1; i<=n; i++) {
			gp[i]= new ArrayList<Integer>();
		}
		for(int i =0; i<m;i++) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			gp[a].add(b);
			gp[b].add(a);
		}
		for (int i=1;i<=n; i++) {
			if(visted[i]!= true) {
				cnt++;
				dfs(i);
			}
		}
		System.out.print(cnt);
	}
	public static void dfs(int v) {
		if (visted[v]==true) {
			return; 
		}
		visted[v]=true;
		for(int i: gp[v]) {
			if(visted[i]!=true) {
				dfs(i);
			}
		}
	}

}
