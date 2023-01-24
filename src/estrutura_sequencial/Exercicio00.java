package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio00 {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a largura do terreno:");
	double largura = sc.nextDouble();
	System.out.println("Digite o comprimento do terreno:");
	double comprimento = sc.nextDouble();
	System.out.println("Digite o valor do M2 do terreno:");
	double valor = sc.nextDouble();
	
	double area = largura * comprimento;
	double preco = area * valor;
	
	System.out.printf("ÁREA: %.2f%n", area);
	System.out.printf("PREÇO: $ %.2f%n", preco);
	
	sc.close();
	
	}
}
