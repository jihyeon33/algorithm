package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*백준 1932) 정수 삼각형 - 다이나믹 프로그래밍   성공! */
public class ex1932 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[][] tree= new int[n+1][n+1];
		int[][] dp= new int[n+1][n+1];
		for(int i=1; i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				if(j>i) {break;}
				tree[i][j]= Integer.parseInt(st.nextToken());
			}
		}
/*		for(int i=1; i<=n; i++) {
			for(int j=1;i<=n ;j++) {
				if(j>i) {break;}
				System.out.println(tree[i][j]);
			}
		}*/
		dp[1][1]=tree[1][1];
		for(int i=2; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j>i) {break;}
				if(j==1) {
					dp[i][j]=dp[i-1][1]+tree[i][1];
				}else if(j==i) {
					dp[i][j]= dp[i-1][j-1]+tree[i][j];
				}else {
					dp[i][j]= Math.max(dp[i-1][j-1]+tree[i][j], dp[i-1][j]+tree[i][j]);
				}
			}
		}
		int result = dp[n][1];
		for(int j=2; j<=n; j++) {
			if(dp[n][j]>result) {
				result = dp[n][j];
			}
		}
		System.out.println(result);
	}

}
