import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                PROGRAMA QUE CONVERTE CELSIUS PARA FAHRENHEIT 
                
                INSIRA AQUI O VALOR EM CELSIUS A SER CONVERTIDO: 
                """);

        while (!sc.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido");
            sc.next();
        }
        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.printf("O valor inserido em celsius é: %.2f \nTal temperatura em Fahrenheit é %.2f \n", celsius, fahrenheit);
        int fahrenheitConvertido = (int) fahrenheit;
        System.out.println("A temperatura fahrenheit inteira é: " + fahrenheitConvertido);
    }
}
