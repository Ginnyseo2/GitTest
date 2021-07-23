package for문;
import java.util.*;

public class 합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		
		System.out.println(total);
	}

}
