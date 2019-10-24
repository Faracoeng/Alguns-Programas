package poo;

public class Fluxo1 extends Thread {
    public void run(){
        for(int i=0; i < 100 ; i++){
            System.err.println("Fazendo uso de herança");
        }
    }
}
