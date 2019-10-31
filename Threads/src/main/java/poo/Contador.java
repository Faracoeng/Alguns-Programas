package poo;

public class Contador {
    private int valorAtual;

    public void incrementar(){
        this.valorAtual += 1;
    }

    public void incrementar(int valor){
        this.valorAtual += valor;
    }

    public int getValorAtual() {
        return valorAtual;
    }
}
