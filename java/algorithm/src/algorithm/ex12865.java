package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 백준 12865) 평범한 배낭 - 다이나믹 프로그래밍  정답성공!! */
public class ex12865 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] w = new int[n+1];  //무게
		int[] p = new int[n+1];  //가치
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			w[i]= Integer.parseInt(st.nextToken());
			p[i]= Integer.parseInt(st.nextToken());
		}
		
		int[][] dp = new int[n+1][k+1];
		
		for(int i =1;i<=n; i++) {
			for(int j=1; j<=k; j++) {
				if (i==1) {   //1번 아이템만
					if(j<w[i]) {
						dp[i][j]=0;
					}else {
						dp[i][j]=p[i];
					}
				}else {  //2번 아이템부터
					if(j<w[i]) {    //j<w[i]
						dp[i][j]= dp[i-1][j];
					}else if(j == w[i]){   //j == w[i]
						int tmp = p[i];
						if (dp[i-1][j]> tmp) {
							tmp=dp[i-1][j];
						}
						dp[i][j]= tmp;
					}else {  ////j > w[i]
						int wgt = w[i];
						int tmp = dp[i-1][j-wgt] +p[i];
						if(tmp<dp[i-1][j]) {
							tmp= dp[i-1][j];
						}
						dp[i][j]= tmp;
					}
				}
			}
		}
		System.out.println(dp[n][k]);
		

	}

}
