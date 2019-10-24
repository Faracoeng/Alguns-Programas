package poo;

public class Fluxo02 implements Runnable {
    public void run(){
        for(int i=0; i < 10 ; i++){
            System.err.println("Fazendo uso de interface");
        }
//        notifyAll();
//        System.err.println("....outra mensagem qualquer....");
    }
}
