package BaekJoon1;

import java.util.Scanner;

public class B_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int weight = sc.nextInt();
        int count = 0;
        
        while(true) {
            if (weight % 5 == 0) {
                System.out.println(weight / 5 + count);
                break;
            }
            else if(weight <= 0) {
                System.out.println(-1);
                break;
            }
            else {
            	weight = weight - 3;
                count++;
            }
        }
	}
}
