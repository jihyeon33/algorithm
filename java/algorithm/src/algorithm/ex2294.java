package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*동전 2*/
public class ex2294 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k= Integer.parseInt(st.nextToken());
		int[] coin=new int[100];
		int[] dp= new int[10001];
		for(int i=1; i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			coin[i]= Integer.parseInt(st.nextToken());
		}
/*		for(int i=0; i<n;i++) {
			System.out.println(coin[i]);
		}*/
		for(int i=1;i<=n;i++) {
			int c = coin[i];
			dp[c]=1;
		}
		for(int i=1;i<=k;i++) {
			for(int j =n; j<=1;j--) {
				if(coin[j]<=i) {
					if(i%coin[j]==0) {//나누어 떨어지면
						int m=i/coin[j];
						int c =coin[j];
						dp[i]=dp[c]*m;
					}else {
						int c =coin[j];
						int t =i-coin[j];
						dp[i]=dp[c]+dp[t];
					}
					break;
				}
			}
		}
		System.out.println(dp[1]);
		System.out.println(dp[5]);
		System.out.println(dp[12]);
		System.out.println(dp[k]);
	}
}
