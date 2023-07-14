package algorithm;

import java.util.Arrays;
import java.util.Scanner;

/*백준2750 수 정렬하기 - 버블정렬  정답이나 버블정렬로풀기*/
public class ex2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] list = new int[n];
		for (int i=0; i<n;i++) {
			int x = sc.nextInt();
			list[i]=x;
		}
		Arrays.sort(list);
		for (int i=0;i<n;i++) {
			System.out.println(list[i]);
		}

	}

}
