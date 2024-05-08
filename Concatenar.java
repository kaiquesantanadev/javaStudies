import java.util.Scanner;

public class Concatenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o preço do produto: ");

        while (!sc.hasNextDouble()) {
            System.out.println("Insira um valor válido");
            sc.next();
        }
        double preco = sc.nextDouble();
        System.out.println("Insira o número que vai multiplicar o preço: ");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, insira um valor inteiro");
            sc.next();
        }
        int multiplicador = sc.nextInt();
        double resultadoFinal = preco * multiplicador;
        System.out.printf("O valor final entre o preço do produto (%.2f) e o multiplicador (%d) é: %.2f", preco, multiplicador, resultadoFinal);
    }
}
