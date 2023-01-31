package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int password = sc.nextInt();
		
		while (password != 2002) {
			System.out.println("Senha Inválida");
			password = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
		
	}

}
