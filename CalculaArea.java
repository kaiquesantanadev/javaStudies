import java.util.Scanner;

public class CalculaArea {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		boolean loop = true;
		while (loop) {
			
			System.out.println("""
					\n
					Calculadora de áreas
					
					Insira a opção 1 se quiser calcular a área de um círculo
					Insira a opção 2 se quiser calcular a área de um quadrado
					Insira a opção 3 para finalizar o programa.
					""");
			
			while (!sc.hasNextInt()) {
				System.out.println("Por favor, insira um número inteiro");
				sc.next();
			}
			
			int opcaoEscolhida = sc.nextInt();
			
			switch (opcaoEscolhida) {
				case 1:
					System.out.println("Você escolheu a opção de calcular áreas de círculos \nQual o raio deste círculo em cm?");
					
					while (!sc.hasNextDouble()) {
						System.out.println("Insira um número válido");
						sc.next();
					}
					
					double raioCirculo = sc.nextDouble();
					double areaCirculo = 3.14 * (raioCirculo * raioCirculo);
					System.out.printf("A área deste círculo é: %.2f \n", areaCirculo);
					Thread.sleep(2000);
					break;
				case 2:
					System.out.println("Você escolheu a opção de calcular áreas de quadrados \nQual é o tamanho de um dos lados do quadrado? ");
					while (!sc.hasNextDouble()) {
						System.out.println("Insira um número válido");
						sc.next();
					}
					
					double ladoQuadrado = sc.nextDouble();
					double areaQuadrado = ladoQuadrado * ladoQuadrado;
					System.out.printf("A área deste quadrado é: %.2f ", areaQuadrado);
					Thread.sleep(2000);
					break;
				case 3:
					System.out.println("Encerrando programa!");
					Thread.sleep(1000);
					sc.close();
					loop = false;
					break;
				default:
					System.out.println("Opção inválida!");
					Thread.sleep(800);
					break;
			}
			
		}
		
		
		
		}
}
