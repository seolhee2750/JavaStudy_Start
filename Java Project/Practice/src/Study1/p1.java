package Study1;

import java.util.Scanner;

// if-else ���ǹ�

public class p1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("���ϴ� ���� ���� �ϳ��� �Է��ϼ���. (���� : -1)");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("¦���Դϴ�.");
			System.out.println("���ϴ� ���� �ϳ��� �Է��ϼ���.");
			n = sc.nextInt();
		}
		
		else if (n % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
			System.out.println("���ϴ� ���� �ϳ��� �Է��ϼ���.");
			n = sc.nextInt();
		}
		
		else {
			System.exit(0);
		}
	}
}
