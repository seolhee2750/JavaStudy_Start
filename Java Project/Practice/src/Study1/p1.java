package Study1;

import java.util.Scanner;

// if-else 조건문

public class p1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		while (n >= 0) {
			System.out.println("원하는 양의 정수 하나를 입력하세요. (종료 : -1)");
			n = sc.nextInt();
			
			if (n % 2 == 0) {
				System.out.println("짝수입니다.");
			}
			
			else if (n % 2 == 1) {
				System.out.println("홀수입니다.");
			}
			
			else {
				System.exit(0);
			}
		}
	}
}
