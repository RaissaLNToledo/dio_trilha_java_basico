import dio.exceptions.ParametrosInvalidosExceptions;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        var num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        var num2 = scanner.nextInt();

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosExceptions e) {
            System.out.println("O segundo número deve ser maior que o primeiro \n");
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosExceptions {
        if(num1 >= num2) {
            throw new ParametrosInvalidosExceptions("O segundo número deve ser maior que o primeiro \n");
        }

        int contagem = num2 - num1;
        for (int i = 1; i <= contagem; i++){
            System.out.printf("Imprimindo o número %s \n", i);
        }
    }
}