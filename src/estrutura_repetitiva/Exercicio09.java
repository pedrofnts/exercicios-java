package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			int square = (int) Math.pow(i, 2);
			int cube = (int) Math.pow(i, 3);
			
			System.out.printf("%d %d %d%n", i, square, cube);
		}
		
		sc.close();
	}

}
