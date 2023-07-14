package algorithm;

import java.util.Scanner;

/*백준11047 동전 0 - 그리디  정답! */
public class ex11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] A = new int[n];
		int tmp=k;	//나머지
		int cnt=0; //결과값
		for(int i=0; i<n; i++) {
			A[i]= sc.nextInt();
		}

		while(tmp!=0) {
			for(int i=n-1; i>=0 ; i--) {
				if(tmp/A[i] >0) {
					cnt = cnt + tmp/A[i];
					if(tmp%A[i] >0) {
						tmp = tmp%A[i];						
					}else {
						tmp = 0;
					}
					break;
				}
			}
		}
		System.out.print(cnt);
	}

}
