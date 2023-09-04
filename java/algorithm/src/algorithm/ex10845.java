package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*큐 출력정상이나 자꾸 널포인터익셉션..문제가 이상함. 포기*/
public class ex10845 {

	public static void main(String[] args) throws IOException {
		Deque<Integer> que = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			String order= st.nextToken();
			if(order.equals("push")) {
				que.offer(Integer.parseInt(st.nextToken()));
			}else if (order.equals("pop")) {
				if(que.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(que.poll()+"\n");
				}
			}else if(order.equals("size")) {
				sb.append(que.size()+"\n");
			}else if(order.equals("empty")) {
				if(que.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
			}else if(order.equals("front")) {
				if(que.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(que.peek()+"\n");
				}
			}else if(order.equals("back")) {
				if(que.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(que.peekLast()+"\n");
				}
			}
		}
		System.out.print(sb);
	}

}
