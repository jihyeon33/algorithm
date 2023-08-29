package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*백준 ex2294 동전 2  - 정답!*/
public class ex2294_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] coin=new int[n];
		int[] dp = new int[10001];		
		for(int i=0;i<n;i++){
			st = new StringTokenizer(br.readLine());
			coin[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<=k;i++) {
			dp[i]=100000;
		}
		dp[0]=0;
		for(int i=1;i<=k;i++) {
			for(int c : coin) {
				if(i-c<0) {
					continue;
				}
				dp[i]=Math.min(dp[i], dp[i-c]+1);
			}
		}
		for(int i=1;i<=k;i++) {
			if(dp[i]==100000) {
				dp[i]=-1;
			}
		}
		System.out.print(dp[k]);

	}

}
