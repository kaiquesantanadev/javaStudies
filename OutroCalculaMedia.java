import java.util.Scanner;

public class OutroCalculaMedia {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	double media = 0;
    	double nota = 0;
    	int quantia = 0;
    	
    	while (nota != -1) {
    		System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar: ");
    		nota = sc.nextDouble();
    		if (nota != -1) {
        		media += nota; 
        		quantia++;
    		}

    	}
    	
    	System.out.println("Média das avaliações: " + media/quantia);
    	
    }
    
}
