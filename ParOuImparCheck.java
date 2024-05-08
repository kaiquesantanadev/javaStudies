import java.util.Scanner;

public class ParOuImparCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("""
				Checagem de números!
				Digite um número e veja se ele é par ou impar:
				""");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Por favor, insira um número válido");
			sc.next();
		}
		
		double numeroEscolhido = sc.nextInt();
		double parOuImpar = numeroEscolhido % 2;
		if (parOuImpar == 0) {
			System.out.printf("O número %.2f é par.", numeroEscolhido);
		} else {
			System.out.printf("O número %.2f é impar", numeroEscolhido);
		}
	}
}
