import java.util.Scanner;

public class Leitura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu filme favorito: ");
		String filmeUser = scanner.nextLine();
		while (filmeUser.isEmpty()) {
			System.out.println("Insira um filme válido.");
			filmeUser = scanner.nextLine();
		}

		System.out.println("Qual o ano de lançamento desse filme? ");
		while (!scanner.hasNextInt()) {
			System.out.println("Insira um ano válido");
			scanner.next();
		}
		int anoFilmeUser = scanner.nextInt();
		
		System.out.println("Dê a nota do seu filme entre 0 a 10: ");
		
		
		double notaUser;
		
        while (true) {
            if (scanner.hasNextDouble()) {
                notaUser = scanner.nextDouble();
                if (notaUser >= 0 && notaUser <= 10) {
                	scanner.close();
                    break; 
                } else {
                    System.out.println("Insira uma nota entre 0 a 10");
                }
            } else {
                System.out.println("Insira uma nota válida ");
                scanner.next();
            }
        }
		
		
		System.out.printf("Seu filme favorito é %s \n", filmeUser);
		System.out.printf("O ano de lançamento do filme é %d \n", anoFilmeUser);
		System.out.printf("Sua nota para o filme é %.2f", notaUser);
		
	}
}
