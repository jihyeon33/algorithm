package algorithm;

import java.util.Scanner;
/*백준2133 타일 채우기 - 다이나믹 프로그래밍 정답!*/
public class ex2133_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[31];
		dp[1]=0;
		dp[2]=3;
		dp[3]=0;
		dp[4]=dp[2]*3+2;
		dp[5]=0;
		for(int i=6;i<=n;i++) {
			if(i%2 !=0) {
				dp[i]=0;
			}else {
				dp[i]=dp[i-2]*3+2;
				for(int k=2;k<=i-4;k+=2){
					dp[i]+=dp[k]*2;
				}				
			}
		}
		System.out.println(dp[n]);
	}

}
