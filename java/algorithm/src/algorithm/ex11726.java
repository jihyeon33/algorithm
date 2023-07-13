package algorithm;

import java.util.Scanner;

/*백준 11726 2×n 타일링  (다이내믹 프로그래밍)  출력정상이나 오답*/
public class ex11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		
		dp[1]=1;
		dp[2]=2;
		for(int i=3; i<=n; i++) {
			dp[i]=(dp[i-1]+dp[i-2]) % 10007;
		}
		System.out.print(dp[n]);
	}
}
