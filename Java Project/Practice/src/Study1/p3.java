package Study1;

import java.util.Scanner;

public class p3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// for문의 기본 형태
		for (int i = 0; i < 10; i++)
		{
			// for문에서 정의된 변수는 for문이 끝나면 메모리에서 사라짐
			System.out.println(i);
		}
		
		// for문 무한루프 첫 번째
		for (;;) {
			System.out.print("원하는 글자 입력 >> ");
			String word = sc.next();
			System.out.println("입력 : " + word);
			
			// if문을 이용해서 탈출
			if (word.equals("종료")) {
				break; // if문에서의 탈출을 의미x, for문 탈출o
			}
		}
		
		// for문 무한루프 두 번째
		for (int i = 0; true; i++) {
			System.out.println(i);
			
			// 위와 마찬가지로 if문으로 탈출
			if (i == 10) {
				break;
			}
		}
		
		System.out.print("원하는 삼각형의 높이를 입력하세요. >> ");
		int h = sc.nextInt();
		
		// 이중 for문
		for (int i = 1; i <= h; i++) {
			// 하위 관계에 있는 for문에서는 상위 for문에서 정의한 변수를 중복으로 정의할 수 없음
			for (int j = 0; j <= h-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		String s = "hi";
		
		// while문 기본 형태
		while (s.contentEquals("hi")) {
			System.out.print("원하는 글자를 입력하세요. >> ");
			s = sc.next();
			System.out.println(s);
		}
		
		// while문 무한루프
		while (true) {
			System.out.print("원하는 글자를 입력하세요. >> ");
			s = sc.next();
			System.out.println(s);
			
			if (s.contentEquals("종료")) {
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
		
		// 이중 while문
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
