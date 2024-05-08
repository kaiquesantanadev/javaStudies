import java.util.Scanner;

public class calculaDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o preço do produto que vai ter o desconto: ");

        while (!sc.hasNextDouble()) {
            System.out.println("Por favor, insira um valor válido.");
            sc.next();
        }
        double preco = sc.nextDouble();
        System.out.println("Insira o número do percentual em desconto: ");

        while (!sc.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido");
            sc.next();
        }

        if (sc.nextDouble() > 100 || sc.nextDouble() < 0) {
            System.out.println("Por favor, insira um número dentre 0 a 100");
        } else {
            double percentualDeDesconto = sc.nextDouble();
            double percentualFinal = 100 - percentualDeDesconto;
            double valorFinal = preco * percentualFinal;
            System.out.println("O valor final a ser pago é $" +valorFinal);
        }

    }
}
