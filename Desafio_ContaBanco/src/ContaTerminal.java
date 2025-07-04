import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        int conta;
        String agencia;
        String nomeUsuario;
        float saldo;

        var scanner = new Scanner(System.in);
        System.out.println("Insira o seu nome:");
        nomeUsuario = scanner.next();
        System.out.printf("Olá, %s! \nInsira, por favor, o número da sua  conta:", nomeUsuario);
        conta = scanner.nextInt();
        System.out.println("Insira também, por favor, sua agência:");
        agencia = scanner.next();
        System.out.println("Por fim, insira o valor do saldo que você possui em sua conta:");
        saldo = scanner.nextFloat();

        System.out.printf("Olá, %s! \nObrigada por criar uma conta em nosso banco. \nSua agência é %s, sua conta é %s e seu saldo de %s já está disponível para o saque", nomeUsuario, agencia, conta, saldo);


    }
}