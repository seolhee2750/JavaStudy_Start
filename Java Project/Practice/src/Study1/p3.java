package Study1;

import java.util.Scanner;

public class p3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// for���� �⺻ ����
		for (int i = 0; i < 10; i++)
		{
			// for������ ���ǵ� ������ for���� ������ �޸𸮿��� �����
			System.out.println(i);
		}
		
		// for�� ���ѷ��� ù ��°
		for (;;) {
			System.out.print("���ϴ� ���� �Է� >> ");
			String word = sc.next();
			System.out.println("�Է� : " + word);
			
			// if���� �̿��ؼ� Ż��
			if (word.equals("����")) {
				break; // if�������� Ż���� �ǹ�x, for�� Ż��o
			}
		}
		
		// for�� ���ѷ��� �� ��°
		for (int i = 0; true; i++) {
			System.out.println(i);
			
			// ���� ���������� if������ Ż��
			if (i == 10) {
				break;
			}
		}
		
		System.out.print("���ϴ� �ﰢ���� ���̸� �Է��ϼ���. >> ");
		int h = sc.nextInt();
		
		// ���� for��
		for (int i = 1; i <= h; i++) {
			// ���� ���迡 �ִ� for�������� ���� for������ ������ ������ �ߺ����� ������ �� ����
			for (int j = 0; j <= h-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		String s = "hi";
		
		// while�� �⺻ ����
		while (s.contentEquals("hi")) {
			System.out.print("���ϴ� ���ڸ� �Է��ϼ���. >> ");
			s = sc.next();
			System.out.println(s);
		}
		
		// while�� ���ѷ���
		while (true) {
			System.out.print("���ϴ� ���ڸ� �Է��ϼ���. >> ");
			s = sc.next();
			System.out.println(s);
			
			if (s.contentEquals("����")) {
				break;
			}
		}
		
		int num = 0;
		
		// do while
		do {
			System.out.println(num);
		} while (num > 0);
		
		int number1 = 1;
		int number2 = 1;
		
		// ���� while��
		while (number1 < 10) {
			while (number2 < 10) {
				System.out.print(number1 + "*" + number2 + "=" + number1*number2 + " ");
				number2++;
			}
			System.out.println("");
			number1++;
		}
	}
}
