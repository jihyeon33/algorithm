package algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

public class ex {

	public static void main(String[] args) {
		String a="hello";
		int alen =a.length();
		Deque deq = new ArrayDeque<String>();
		for(int i=0;i<alen;i++) {
			String t =a.substring(i,i+1);
			deq.offerLast(t);
		}
		System.out.print(deq);

	}

}
