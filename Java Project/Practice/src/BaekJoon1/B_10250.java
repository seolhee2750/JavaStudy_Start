package BaekJoon1;

import java.util.Scanner;

public class B_10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int n = 0;
			int m = 0;
			
			if (N%H != 0) {
				n = (N/H) + 1;
				m = N%H;
			}
			
			else {
				n = N/H;
				m = H;				
			}
			
			System.out.println(m*100 + n);
		}
	}
}
