package contador;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        if (numeroUm < numeroDois){
            throw new ParametrosInvalidosException("O primeiro número deve ser maior que o segundo número.");
        }

        int contagem = numeroUm - numeroDois;
    }
}
