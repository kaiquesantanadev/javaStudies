import java.util.Random;
import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Jogo da adivinhação! Quer testar sua sorte? Insira um número, nós escolheremos um número aleatório dentre 0 e a faixa que você enviou, tente adivinhar!");
		
		while (!sc.hasNextInt()) {
			System.out.println("Por favor, insira um número inteiro como faixa.");
			sc.next();
		}
		
		int faixaDeNumeros = sc.nextInt();
		int tentativas = 1;
		
		System.out.println("Hora de testar sua sorte! Insira um número inteiro e veja se pensamos no mesmo número: ");

		int numeroEscolhido = -1;
		int randomNumber = new Random().nextInt(faixaDeNumeros);
		
		while (numeroEscolhido != randomNumber) {
			while (!sc.hasNextInt()) {
				System.out.println("Por favor, insira um número inteiro.");
				sc.next();
			};
			numeroEscolhido = sc.nextInt();
			if (numeroEscolhido == randomNumber) {
				System.out.printf("Parabéns, você adivinhou o número que pensamos em %d", tentativas);
				sc.close();
			} else {
				System.out.println("Você não adivinhou! Tente denovo");
				System.out.println("O número que pensamos foi: " + randomNumber);
				tentativas++;
			}
		}
	}
}
