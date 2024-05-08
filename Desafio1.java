import java.util.Scanner;

public class Desafio1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("""
					Checagem de números
					
					Insira um número quaisquer:
					""");
			
			while (!sc.hasNextDouble()) {
				System.out.println("Por favor, insira um número válido.");
				sc.next();
			}
			double numero1 = sc.nextDouble();
			System.out.println("Insira o segundo número: ");
			
			while (!sc.hasNextDouble()) {
				System.out.println("Por favor, insira um número válido.");
				sc.next();
			}
			double numero2 = sc.nextDouble();
			
			if (numero1 > numero2) {
				System.out.printf("O número %.2f é maior que o número %.2f", numero1, numero2);
			} else if (numero2 > numero1) {
				System.out.printf("O número %.2f é maior que o número %.2f", numero2, numero1);
			} else if (numero2 == numero1) {
				System.out.println("Os números são iguais.");
			}
			
		}
}
