package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
