package poo;

import java.util.Random;

public class Contador {
    private int valorAtual;

    public void incrementar(){
        this.valorAtual += 1;
    }

    public void incrementar(int valor){
        try {
            Thread.sleep(new Random().nextInt(4000)+1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
         }
        this.valorAtual += valor;
    }

    public int getValorAtual() {
        return valorAtual;
    }
}
