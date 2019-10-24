package poo;

public class Fluxo1 extends Thread {
    public void run(){
        for(int i=0; i < 10 ; i++){
            System.err.println("Fazendo uso de herança");
        }
//        try {
//            wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.err.println("....mensagem qualquer....");
    }
}
