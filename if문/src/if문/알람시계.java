package if문;
import java.util.*;
public class 알람시계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m - 45 < 0) {
			if (h - 1 < 0) {
				h = 23;
				System.out.printf("%d %d", h, 60 - (45 - m));
			}
			else {
				System.out.printf("%d %d", (h - 1), 60 - (45 - m));
			}
		}
		else {
			System.out.printf("%d %d", h, (m - 45));
		}
			
	}

}
