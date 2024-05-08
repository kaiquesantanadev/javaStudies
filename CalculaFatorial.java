import java.util.Scanner;

public class CalculaFatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número inteiro e veja o seu fatorial");
		
		while (!sc.hasNextInt()) {
			System.out.println("Por favor, insira um número inteiro");
			sc.next();
		}
		
		int numero = sc.nextInt();
		int fatorial = numero;
		for (int i = numero - 1; i >= 1; i--) {
			System.out.println();
			fatorial *= i;
		}
		System.out.printf("O fatorial de %d é %d", numero, fatorial);
	}
}
