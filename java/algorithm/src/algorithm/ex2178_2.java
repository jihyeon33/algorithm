package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2178_2 {
	public static char[][] gp;
	public static int X;
	public static int Y;
	public static ArrayList<Integer> rslt;
	public static void main(String[] args) {
		rslt = new ArrayList<Integer>();
		Scanner sc = new Scanner (System.in);
		X = sc.nextInt();
		Y = sc.nextInt();
		gp = new char[X][Y];
		for(int i=0;i<X;i++) {
			String str = sc.next();
			for(int j=0;j<Y;j++) {
				gp[i][j]=str.charAt(j);
			}
		}
		go(0,0,0);
		System.out.println(rslt);
	}
	public static void go(int x, int y, int cnt) {
		if(x==X-1 && y==Y-1) {
			rslt.add(cnt);
			return;
		}
		if(x+1<=X-1 && gp[x+1][y]=='1') {
			go(x+1,y,cnt+1);
			System.out.println("아래로");
		}
		if(y+1<=Y-1 && gp[x][y+1]=='1') {
			go(x,y+1,cnt+1);
			System.out.println("오른쪽으로");
		}
		return;
	}
}
