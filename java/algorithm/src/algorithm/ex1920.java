package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*백준1920 수 찾기 - 이진탐색  오답,에러남. */
public class ex1920 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] set = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			set[i]= Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int[] target = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m;i++) {
			target[i]= Integer.parseInt(st.nextToken());
		}
		Arrays.sort(set);  //자바 sort nlogn
		//for(int i=0; i<n;i++) {System.out.println(set[i]);}
		for(int i=0; i<m; i++) {  //m x nlogn (이진 탐색)  = mnlogn
			int rslt =binarySearch(set, target[i], 0, n-1);
			System.out.println(rslt);
		}
	}
	//nlogn (이진 탐색)
	public static int binarySearch(int[] set, int x, int strt, int end) {
		System.out.println(x);
		if(strt ==end) {
			if(set[strt]==x) {return 1;
			}else {return 0;}
		}else {
			int median = (strt + end) /2;
			if(set[strt]<=x && x< set[median]) {
				binarySearch(set, x, strt, median);
			}else if(set[median] <x && x<=set[end]) {
				binarySearch(set, x, median, end);
			}else if(x == set[median]){
				return 1;
			}
			return 0;
		}
	}

}
