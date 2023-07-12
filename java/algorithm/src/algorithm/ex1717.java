package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*백준 1717 집합의 표현*/
public class ex1717 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());  //다음라인을 읽을때는 st 초기화
		int c = Integer.parseInt(st.nextToken());
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
