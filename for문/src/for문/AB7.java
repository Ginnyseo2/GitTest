package for문;
import java.util.*;

public class AB7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []total = new int[n];
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			total[i] = a + b;
		}
		
		for (int i = 0; i < total.length; i++) {
			System.out.println("Case #" + (i + 1) + ": " + total[i]);
		}
	}

}
