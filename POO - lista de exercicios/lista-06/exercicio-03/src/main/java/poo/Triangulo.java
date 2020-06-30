package poo;

public class Triangulo {
    private Linha[] retas;

    public Triangulo(Linha[] linhas) {
        this.retas = linhas;
    }
    public void desenhar(){
        for(int i = 0 ; i  < 3 ; i++){
            this.retas[i].desenhar();
        }
    }
    public double calculaArea(double base, double altura){
        return (base * altura) / 2 ;
    }
}
