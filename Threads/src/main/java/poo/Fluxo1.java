package poo;

public class Fluxo1 extends Thread {
    private Contador count;

    public Fluxo1(Contador count) {
        this.count = count;
    }

    public void run(){
        for(int i=0; i < 10 ; i++){
            System.err.println("Fazendo uso de herança");
        }
    }
}
