package algorithm;

import java.util.Scanner;
/*백준2133 타일 채우기 - 다이나믹 프로그래밍 틀림*/
public class ex2133 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp =new int[n+1];
		dp[0]=0;
		dp[1]=0;
		dp[2]=3;
		for(int i=3;i<=n;i++) {
			if (i%2 != 0) {
				dp[i]=0;
			}else {
				int k= i/2;
				int t= k-1;
				int sum1=1;
				for(int j=0;j<k;j++) {
					sum1= sum1*3;
				}
				int sum2=1;
				for(int j=0;j<t;j++) {
					sum2=sum2*2;
				}
				int sum = sum1+sum2;
				dp[i]=sum;
			}
		}
		System.out.println(dp[n]);
	}
}
