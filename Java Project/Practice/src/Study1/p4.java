package Study1;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �迭 ���� 1
		int[] num = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("");
		
		// �迭 ����2
		int[] num2 = new int[5];
		System.out.print("5���� ������ �Է��ϼ���. >> ");
		
		for (int i = 0; i < num2.length; i++) {
			num2[i] = sc.nextInt();
			System.out.println(num2[i]);
		}
		
		System.out.println("");
		
		// for-each��
		for (int number : num2) {
			System.out.println(number);
		}
		
		// 2���� �迭 ����
		int[][] array = new int[9][9];
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				array[i][j] = (i+1) * (j+1);
				System.out.print((i+1) + "*" + (j+1) + "=" + array[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
}
