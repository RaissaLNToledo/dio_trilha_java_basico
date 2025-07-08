public class Carro {
    boolean carroLigado;
    int marcha;
    int velocidade;

    public Carro() {
        carroLigado = false;
        marcha = 0;
        velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public boolean isCarroLigado() {
        return carroLigado;
    }

    public boolean ligar(){
        if(carroLigado){
            System.out.println("Carro já está ligado");
        } else {
            carroLigado = true;
        }
        return carroLigado;
    }

    public boolean desligar(){
        if(marcha == 0 && velocidade == 0){
            carroLigado = false;
        }
        else {
            System.out.println("O carro só pode ser desligado quando estiver com velocidade = 0 e na marcha neutra (marcha 0)");
        }
        return carroLigado;
    }

    public void statusCarro(){
        var messageStatus = (carroLigado) ? "carro ligado" : "carro desligado";
        System.out.printf("Status do carro: %s \n", messageStatus);
        System.out.printf("Marcha atual: %s \n", marcha);
        System.out.printf("Velocidade atual: %s \n", velocidade);
    }




    public int acelerar(){

    }
}
