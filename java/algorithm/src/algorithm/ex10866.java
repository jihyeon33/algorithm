package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*덱  출력정상이나 자꾸 널포인터익셉션..문제가 이상함. 포기*/
public class ex10866 {

	public static void main(String[] args) throws IOException {
		Deque<Integer> deq = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BufferedReader br;
		ArrayList<ArrayList<Object>> orders = new ArrayList<>();
		for(int i=0;i<n;i++) {
			orders.add(new ArrayList<>());
		}
		for(int i=0;i<n;i++) {
			br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a=st.nextToken();
			int b = 0;
			if(st.hasMoreTokens()) {
				b = Integer.parseInt(st.nextToken());
			}
			ArrayList<Object> order = new ArrayList<>();
			order.add(a);
			order.add(b);
			orders.set(i, order);
		}
		for(int i=0;i<n;i++) {
			String order = (String) orders.get(i).get(0);
			if (order.equals("push_front")) {
				int x = (int) orders.get(i).get(1);
				deq.addFirst(x);
			}else if(order.equals("push_back")) {
				int x = (int) orders.get(i).get(1);
				deq.addLast(x);
			}else if(order.equals("pop_front")) {
				if(deq.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deq.pollFirst());
				}
			}else if (order.equals("pop_back")) {
				if(deq.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deq.pollLast());
				}
			}else if(order.equals("size")) {
				System.out.println(deq.size());
			}else if(order.equals("empty")) {
				if(deq.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(order.equals("front")) {
				if( deq.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deq.peekFirst());
				}
			}else if(order.equals("back")) {
				if( deq.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deq.peekLast());
				}				
			}
		}
	}
}
