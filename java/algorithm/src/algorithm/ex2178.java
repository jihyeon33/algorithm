package algorithm;
import java.util.*;
/*백준 2178번 bfs*/
public class ex2178 {
	static boolean[][] visited;
	static int[][] gp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		gp= new int[n][m];
		visited = new boolean[n][m];
		for(int i=0; i<n; i++) {
			String a = sc.next();
			for(int j=0;j<m;j++) {
				int b= Integer.parseInt(a.substring(j, j+1));
				gp[i][j]=b;
				visited[i][j]=false;
				System.out.print(gp[i][j]);
			}
		}
		for(int i =0;i<n;i++) {
			System.out.println(gp[i]);
		}
		for(int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if(visited[i][j]!=true) {
					bfs(i,j);
				}
			}
		}

	}
	public static void bfs(int x, int y) {
	}

}
