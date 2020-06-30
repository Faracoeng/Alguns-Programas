package poo;

public class Retangulo {
    private Linha[] retas;

    public Retangulo(Linha[] linhas) {
        this.retas = linhas;
    }
    public void desenhar(){
        for(int i = 0 ; i  < 4 ; i++){
            this.retas[i].desenhar();
        }
    }
    public double calculaArea(){
        double tamanhoReta = 1;
        for(int i = 0 ; i  < 4 ; i++){
            tamanhoReta = tamanhoReta * this.retas[i].tamanhoReta();
        }
        return tamanhoReta;
    }
}
