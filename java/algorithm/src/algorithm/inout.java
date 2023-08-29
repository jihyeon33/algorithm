package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class inout {

	public static void main(String[] args) throws IOException {
		// Scanner
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		//BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());

	}

}
