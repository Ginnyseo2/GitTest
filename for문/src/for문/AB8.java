package for문;

import java.util.Scanner;

public class AB8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			total = a + b;
			System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + total);
		}
	}

}
