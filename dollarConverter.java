import java.util.Scanner;

public class dollarConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor em reais a ser convertido em dolar: ");

        while (!sc.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido: ");
            sc.next();
        }

        double valorReais = sc.nextDouble();
        double valorDolar = 4.94;
        double realEmDolar = valorReais / valorDolar;
        System.out.printf("Você tem aproximadamente %.2f doláres levando a cotação atual do valor do dolar em $%.2f", realEmDolar, valorDolar);
    }
}
