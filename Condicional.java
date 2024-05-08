public class Condicional {
	public static void main(String[] args) {
		int anoDeLancamento = 2020;
		boolean incluidoNoPlano = true;
		double notaDofilme = 8.1;
		String tipoPlano = "plus";
		
		if (anoDeLancamento >= 2022) {
			System.out.println("Novos lançamento que os clientes estão curtindo.");
		} else {
			System.out.println("Filme retrô que vale a pena assistir!");
		};
		
		if (incluidoNoPlano && tipoPlano.equals("plus")) {
			System.out.println("Filme liberado");
		} else {
			System.out.println("Pague a locação para assistir o filme.");
		}
		
		
		
		
	}
}
