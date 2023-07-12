package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*백준 1717 집합의 표현*/
public class ex1717 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] list;
		list = new ArrayList[m+1];
		for(int i =1; i<=m ; i++) {
			list[i]= new ArrayList<Integer>();
		}
		for (int i=1; i<=m ;i++) {
			st = new StringTokenizer(br.readLine());  //다음라인을 읽을때는 st 초기화
			list[i].add(Integer.parseInt(st.nextToken()));
			list[i].add(Integer.parseInt(st.nextToken()));
			list[i].add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i =1; i<=m ;i++) {
			System.out.println(list[i]);
		}

	}

}
