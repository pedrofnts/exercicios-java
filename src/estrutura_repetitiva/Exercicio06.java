package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double n1;
		double n2;
		double n3;
		double mp = 0;
		
		for (int i = 0; i < n; i++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			
			mp = (n1 * 2 + n2 * 3 + n3 * 5)/10;
			
			System.out.printf("%.1f%n", mp);
		}
		
		
		sc.close();
	}

}
