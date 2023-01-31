package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int x;
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < n; i++) {
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		sc.close();

	}

}
