package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 빠른AB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		int num = Integer.parseInt(n);
		int []total = new int[num];
		
		for (int i = 0; i < num; i++) {
			String input = br.readLine();
			String[] str = input.split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			total[i] = a + b;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < total.length; i++) {
			bw.write(String.valueOf(total[i]) + "\n");
		}
		bw.flush();
		bw.close();
	}

}
