package Study1;

import java.util.Scanner;

public class p2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = 0;
		
		while (n >= 0) {
			System.out.println("원하는 양의 정수 하나를 입력하세요. (종료 : -1)");
			n = sc.nextInt();
			
			switch (n % 2) {
			case 0:
				System.out.println("짝수입니다.");
				break;
			case 1:
				System.out.println("홀수입니다.");
				break;
			default :
				System.exit(0);
				break;
			}		
		}
	}
}
