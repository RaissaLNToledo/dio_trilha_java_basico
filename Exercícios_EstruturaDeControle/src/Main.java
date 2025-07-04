import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int exercicio;
        do {
            System.out.println("Escolha um exercício de 1 a 4 (Digite 9 para encerrar):");
            exercicio = scanner.nextInt();
            switch (exercicio) {
                case 1:
                    System.out.println("Digite um número:");
                    var numero = scanner.nextFloat();
                    for (var i = 1; i <=10; i++){
                        var resultado = i*numero;
                        System.out.printf("%s * %s = %s \n", numero, i, resultado);
                    };
                    break;
                case 2:
                    System.out.println("Digite sua altura (em metros):");
                    var altura = scanner.nextFloat();
                    System.out.println("Digite seu peso (em quilogramas):");
                    var peso = scanner.nextFloat();
                    var imc = peso/(altura*altura);
                    if (imc <=18.5) {
                        System.out.printf("IMC: %s, Status: Abaixo do peso ideal \n", imc);
                    } else if (imc > 18.5 && imc <25){
                            System.out.printf("IMC: %s, Status: Peso ideal \n", imc);
                    } else if (imc >= 25 && imc < 30){
                        System.out.printf("IMC: %s, Status: Levemente acima do peso \n", imc);
                    } else if (imc >=30 && imc <35 ) {
                        System.out.printf("IMC: %s, Status: Obesidade Grau I \n", imc);
                    } else if (imc >=35 && imc<40) {
                        System.out.printf("IMC: %s, Status: Obesidade Grau II (Severa) \n", imc);
                    } else if (imc >=40) {
                        System.out.printf("IMC: %s, Status: Obesidade Grau III (Mórbida) \n", imc);
                    };
                    break;
                case 3:
                    System.out.println("Escolha um número inteiro");
                    var num1 = scanner.nextInt();
                    int num2;
                    do{
                        System.out.printf("Escolha um numero inteiro maior que %s \n", num1);
                        num2 = scanner.nextInt();
                        if(num1 >= num2){
                            System.out.printf("O segundo número escolhido deve ser maior que %s", num1);
                        }
                    } while (num1 >= num2);
                    System.out.println("Par ou impar?");
                    var par = scanner.next().equalsIgnoreCase("par");
                    var num2Par = (num2 % 2 == 0);
                    if ((par) && (num2Par)){
                        for (var j = num2; j >=num1; j-=2){
                            System.out.println(j);
                        }
                    } else if (par) {
                        num2--;
                        for (var j = num2; j >=num1; j-=2){
                            System.out.println(j);
                        }
                    } else if ((!par) && (!num2Par)) {
                        for (var j = num2; j >=num1; j-=2){
                            System.out.println(j);
                        }
                    } else {
                        num2--;
                        for (var j = num2; j >=num1; j-=2){
                            System.out.println(j);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Informe um número inteiro diferente de zero:");
                    var divisor = scanner.nextInt();
                    // Verificando se o numero é diferente de zero
                    while(divisor == 0) {
                        System.out.println("Zero não é permitido. Digite outro número");
                        divisor = scanner.nextInt();
                    }
                    var restoZero = true;
                    int dividendo;
                    do {
                        System.out.printf("Informe um número inteiro que não seja divisível por %s \n", divisor);
                        dividendo = scanner.nextInt();
                        if (dividendo >= divisor) {
                            var resto = dividendo % divisor;
                            restoZero = (resto == 0);
                        } else {
                            System.out.println("O segundo número não pode ser menor que o primeiro!\n");
                            continue;
                        }
                    } while (restoZero);
                    System.out.printf("%s não é divisível por %s\n", dividendo, divisor);
                    break;
                case 9:
                    System.out.println("Até a próxima!");
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            } //fecha o switch
        } while (exercicio != 9); //fecha o do
    } //fecha o main
} //fecha a class Main