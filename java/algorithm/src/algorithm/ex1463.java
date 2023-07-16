package algorithm;

import java.util.Scanner;

/*백준 1463 1로 만들기  - 다이나믹 프로그래밍   정답! */
public class ex1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long rslt;
		int n = sc.nextInt();
		long[] dp = new long[1000001];
		
		dp[2]=1;
		dp[3]=1;
		for(int i=4; i<=n; i++) {
			if(i%3==0) {
				dp[i]= dp[i/3]+1;
				//2로도 나누어진다면
				if(i%2==0) {
					if(dp[i/2]+1 < dp[i]) {
						dp[i]= dp[i/2]+1;
					}
				}
				//1뺀것과 비교
				if(dp[i-1]+1 <dp[i]) {
					dp[i]= dp[i-1]+1;
				}
				
			}else if(i %2==0) {
				//1뺀것과 비교
				dp[i]=dp[i/2]+1;
				if(dp[i-1]+1< dp[i]) {
					dp[i]=dp[i-1]+1;
				}
			}else {
				dp[i]= dp[i-1]+1;
			}
			
		}
		rslt= dp[n];
		
		System.out.println(rslt);

	}

}
