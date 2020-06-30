package poo;

import static com.sun.tools.doclint.Entity.pi;

public class Circulo {
    private Ponto centro;
    private double raio;

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }
    public void desenhar (){
        System.out.println("Circulo com raio =" + this.raio+" centro em: "+ centro.toString());
    }
    public double calculaArea(){
        return 3.14 *this.raio*this.raio;
    }

}
