package Study1;

import java.util.Scanner;

public class p2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = 0;
		
		while (n >= 0) {
			System.out.println("���ϴ� ���� ���� �ϳ��� �Է��ϼ���. (���� : -1)");
			n = sc.nextInt();
			
			switch (n % 2) {
			case 0:
				System.out.println("¦���Դϴ�.");
				break;
			case 1:
				System.out.println("Ȧ���Դϴ�.");
				break;
			default :
				System.exit(0);
				break;
			}		
		}
	}
}
