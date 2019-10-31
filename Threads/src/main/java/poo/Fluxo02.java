package poo;

import java.util.Random;

public class Fluxo02 implements Runnable {
    private Contador count;

    public Fluxo02(Contador count) {
        this.count = count;
    }


    public void run(){
        System.err.println("antes: fluxo 02"+ " valor: "+ this.count.getValorAtual());
        try {
            Thread.sleep(new Random().nextInt(4000) + 1001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0; i < 10 ; i++){
            //System.err.println("Fazendo uso de interface");
            this.count.incrementar(this.count.getValorAtual() + 1);
        }
        System.err.println("depois: fluxo 02"+ " valor: "+ this.count.getValorAtual());
    }
}
