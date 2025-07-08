import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Vamos criar uma conta? Qual valor deseja depositar para criar sua conta?");
        double valorInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(valorInicial);
        int escolhaDoUsuario;
        do {
            System.out.println("Escolha uma opção do menu \n1 - Consultar saldo \n2 - Verificar o uso do cheque especial \n3 - Consultar valor usado do cheque especial \n4 - Depositar dinheiro \n5 - Sacar dinheiro \n6 - Pagar boleto \n7 - Verificar resumo da conta \n8 - Sair do programa");
            escolhaDoUsuario = scanner.nextInt();
            switch (escolhaDoUsuario){
                case 1:
                    System.out.printf("Saldo da conta: %s \n", conta.consultarSaldo());
                    System.out.println("============================= \n\n\n");
                    break;
                case 2:
                    if(conta.verificarUsoCheque()){
                        System.out.println("Sim! Você está usando o cheque especial! \n");
                    } else {
                        System.out.println("Não! Você não está usando cheque especial \n");
                    }
                    System.out.println("============================= \n\n\n");
                    break;
                case 3:
                    System.out.printf("Você está usando %s reais do cheque especial. Atenção! Pode ser cobrada uma taxa de juros sobre esse valor. \n", conta.consultarCheque());
                    System.out.println("============================= \n\n\n");
                    break;
                case 4:
                    System.out.println("Digite o valor que gostaria de depositar:");
                    double valor = scanner.nextDouble();
                    conta.depositar(valor);
                    conta.status();
                    System.out.println("============================= \n\n\n");
                    break;
                case 5:
                    System.out.println("Digite o valor que deseja sacar:");
                    valor = scanner.nextDouble();
                    conta.sacarDinheiro(valor);
                    System.out.println("============================= \n\n\n");
                    break;
                case 6:
                    System.out.println("Digite o valor da conta que gostaria de pagar:");
                    valor = scanner.nextDouble();
                    conta.pagarConta(valor);
                    System.out.println("============================= \n\n\n");
                    break;
                case 7:
                    conta.status();
                    System.out.println("============================= \n\n\n");
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Valor inválido. Digite uma opção válida");
                    break;
            }
        } while (escolhaDoUsuario != 8);
    }
}