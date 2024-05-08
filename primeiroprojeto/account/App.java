package primeiroprojeto.account;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Account conta = new Account("Kaique", "Corrente", 1000);
		System.out.println(conta);
		
		boolean controlador = true;
		
		while (controlador) {
			System.out.println("""
					
					Operações:
					
					1) Consultar saldo
					2) Receber valores
					3) Transferir valores
					4) Sair
					""");
			
			while (!sc.hasNextInt()) {
				System.out.println("Por favor, insira um número inteiro como opção.");
				sc.next();
			}
			
			int escolha = sc.nextInt();
			
			switch (escolha) {
				case 1:
					System.out.printf("\nO seu saldo é de R$%.2f\n", conta.consultarSaldo());
					Thread.sleep(1900);
					break;
				case 2:
					System.out.println("Qual o valor em R$ que vai ser depositado na conta?: ");
					
					while(!sc.hasNextDouble()) {
						System.out.println("Por favor, insira um valor válido");
						sc.next();
					}
					double valorDeposito = sc.nextDouble();
					conta.setarSaldo(valorDeposito);
					System.out.printf("Foi depositado R$%.2f com sucesso na sua conta", valorDeposito);
					Thread.sleep(1900);
					break;
				case 3:
					System.out.println("Qual o valor em R$ que vai ser transferido da sua conta?: ");
					
					while(!sc.hasNextDouble()) {
						System.out.println("Por favor, insira um valor válido");
						sc.next();
					}
					double valorTransferir = sc.nextDouble();
					conta.transferirSaldo(valorTransferir);
					Thread.sleep(1900);
					break;
				case 4:
					System.out.println("Encerrando sistema!");
					controlador = false;
					sc.close();
					break;
				default:
					System.out.println("Insira uma opção válida!");
					Thread.sleep(1700);
					break;
			}
		}
	}
	

}
