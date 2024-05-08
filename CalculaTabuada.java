import java.util.Scanner;

public class CalculaTabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora de tabuada\nInsira um número inteiro e veja sua tabuada do 0 ao 10: ");
		
		while (!sc.hasNextInt()) {
			System.out.println("Por favor, insira um número inteiro");
			sc.nextInt();
		}
		
		int numero = sc.nextInt();
		
		for (int i = 0; i <=10 ; i++) {
			int result = numero * i;
			System.out.printf("%d x %d = %d \n", numero, i, result);
		}
	}
}
