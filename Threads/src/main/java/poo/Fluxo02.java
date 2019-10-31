package poo;

public class Fluxo02 implements Runnable {
    private Contador count;

    public Fluxo02(Contador count) {
        this.count = count;
    }


    public void run(){
        for(int i=0; i < 10 ; i++){
            System.err.println("Fazendo uso de interface");
            this.count.incrementar();
        }
    }
}
