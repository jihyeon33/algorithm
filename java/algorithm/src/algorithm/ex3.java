package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ex3 {
	static int t;
	static ArrayList<Integer>[] gp;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		t = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int v= Integer.parseInt(st.nextToken());
		int e= Integer.parseInt(st.nextToken());
		for(int i=0;i<=v;i++) {
			gp[i]= new ArrayList<Integer>();
		}
		for (int i=0; i<e;i++) {
			st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
		}
	}

}
