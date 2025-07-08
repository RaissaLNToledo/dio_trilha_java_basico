public class ContaBancaria {
    private double saldo;
    private final double limiteCheque;
    private double limiteConta;
    private double taxaCheque;

    public ContaBancaria(double deposito) {
        this.saldo = deposito;
        if (deposito <= 500){
            limiteCheque = 50;
        } else {
            limiteCheque = 0.5*deposito;
        }
        this.limiteConta = saldo + limiteCheque;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarCheque() {
        double valorUsadoCheque = saldo <0 ? -saldo : 0;
        return valorUsadoCheque;
    }

    private double atualizarLimiteConta(double valor){
        limiteConta = valor + limiteCheque;
        return limiteConta;
    }

    public void pagarConta(double valor){
        if (saldo >= valor){
            saldo = saldo - valor;
            limiteConta = atualizarLimiteConta(saldo);
            System.out.printf("Conta no valor de %s paga com sucesso. \nSaldo atual: %s \nLimite da conta: %s", valor, saldo, limiteConta);
        } else if (limiteConta >= valor) {
             saldo = saldo - valor;
             limiteConta = atualizarLimiteConta(saldo);
            System.out.printf("Conta no valor de %s paga com sucesso. \nSaldo atual: %s \nLimite da conta: %s \nVocê está utilizando o cheque especial.", valor, saldo, limiteConta);
        } else {
            System.out.println("Saldo insuficiente para o pagamento da conta!");
        }
    }

    public void sacarDinheiro(double valor){
        if (saldo >= valor){
            saldo = saldo - valor;
            limiteConta = atualizarLimiteConta(saldo);
            System.out.printf("%s reais sacado com sucesso. \nSaldo atual: %s \nLimite da conta: %s", valor, saldo, limiteConta);
        } else if (limiteConta >= valor) {
            saldo = saldo - valor;
            limiteConta = atualizarLimiteConta(saldo);
            System.out.printf("%s reais sacado com sucesso. \nSaldo atual: %s \nLimite da conta: %s \nVocê está utilizando o cheque especial.", valor, saldo, limiteConta);
        } else {
            System.out.printf("Saldo insuficiente! Saque máximo permitido %s", limiteConta);
        }
    }

    public boolean verificarUsoCheque(){
        if (saldo < 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void depositar(double valor){
        taxaCheque = taxaCheque + 0.2*(-saldo);
        if (valor >= (taxaCheque + (-saldo))){
            valor = valor - (-saldo) - taxaCheque;
            taxaCheque = 0;
            saldo = valor;
        } else if (valor >= (-saldo)) {
            double sobra = valor - (-saldo);
            taxaCheque -= sobra;
            saldo = 0;

            if (taxaCheque < 0){
                saldo += -taxaCheque;
                taxaCheque = 0;
            }
        } else {
            saldo = saldo + valor;
        }

        limiteConta = atualizarLimiteConta(saldo);
    }

    public void status() {
        System.out.printf("Saldo atual: %.2f\n", saldo);
        System.out.printf("Limite do cheque especial: %.2f\n", limiteCheque);
        System.out.printf("Limite total disponível: %.2f\n", limiteConta);
        System.out.printf("Taxa acumulada: %.2f\n", taxaCheque);
        if (verificarUsoCheque()) {
            System.out.println("Você está usando o cheque especial.");
        }
    }

}
