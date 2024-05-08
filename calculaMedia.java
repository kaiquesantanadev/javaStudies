import java.util.Scanner;

public class calculaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                CALCULADOR DE MÉDIAS:
                
                Insira a quantidade de números a serem mediadas:
                """);

        while (!sc.hasNextInt()) {
            System.out.println("Por favor, insira um número inteiro");
            sc.next();
        }

        int quantia = sc.nextInt();
        double numeros = 0;
        double media = 0;
        for (int i = 1; i <= quantia; i++) {

            System.out.printf("Insira o número %d que vai ser mediado: ", i);
            while (!sc.hasNextDouble()) {
                System.out.println("Por favor, insira um número valido! ");
                sc.next();
            }

            numeros += sc.nextDouble();
            if (i == quantia) {
                media = numeros / quantia;
            }
        }
        System.out.printf("A média dos números é: %.2f \n", media);
        int mediaInteira = (int) media;
        System.out.printf("A média inteira dos números é %d", mediaInteira);
    }
}
