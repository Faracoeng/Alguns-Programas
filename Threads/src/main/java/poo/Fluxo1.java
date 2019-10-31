package poo;

import java.util.Random;

public class Fluxo1 extends Thread {
    private Contador count;

    public Fluxo1(Contador count) {
        this.count = count;
    }

    public void run(){



        System.err.println("antes: fluxo 01"+ " valor: "+this.count.getValorAtual());

        try {
            Thread.sleep( new Random().nextInt(4000) + 1001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0; i < 10 ; i++){
            //System.err.println("Fazendo uso de herança");
            this.count.incrementar(this.count.getValorAtual() + 1);
        }
        System.err.println("depois: fluxo 01"+ " valor: "+this.count.getValorAtual());
    }
}
