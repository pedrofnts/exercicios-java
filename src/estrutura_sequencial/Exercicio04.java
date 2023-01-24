package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		double hours = sc.nextDouble();
		double valuePerHour = sc.nextDouble();
		
		double salary = hours * valuePerHour;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = US$ %.2f%n", salary);

		sc.close();
	}

}
