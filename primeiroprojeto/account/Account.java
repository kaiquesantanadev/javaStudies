package primeiroprojeto.account;

public class Account {
	private String nome;
	private String tipoConta;
	private double saldoConta;
	
	public Account(String nome, String tipoConta, double saldoConta) {
		this.nome = nome;
		this.tipoConta = tipoConta;
		this.saldoConta = saldoConta;
	}
	
	public double consultarSaldo() {
		return this.saldoConta;
	}
	
	public double setarSaldo(double valor) {
		return this.saldoConta += valor;
	}
	
	public void transferirSaldo(double valor) {
		if (valor > this.saldoConta) {
			System.out.printf("Você não tem R$%.2f para transfeir disponíveis para transferência.", valor);
		} else {
			this.saldoConta -= valor;
			System.out.printf("Você transferiu R$%.2f da sua conta, agora sua conta tem R$%.2f", valor, this.saldoConta);
		}
	}

	@Override
	public String toString() {
		return """
				************************** 
				
				Informações da conta:
				
				Nome do cliente: %s
				Tipo da conta: %s
				Saldo da conta: %.2f
				
				**************************
				""".formatted(this.nome, this.tipoConta, this.saldoConta);
	}
	
	
}
