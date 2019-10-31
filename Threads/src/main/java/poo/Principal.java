package poo;

public class Principal {
    public static void main(String[] args) {
        Contador count = new Contador();
        //Contador count02 = new Contador();
        Thread comHeranca = new Fluxo1(count);
        Thread comInterface = new Thread(new Fluxo02(count));
        //Thread outraComHeranca = new Fluxo03("terceiraThread");



        comHeranca.start();
        comInterface.start();
        //outraComHeranca.start();
        try {
            comHeranca.join();
           // comInterface.join();
        } catch (InterruptedException e) {
            System.err.println(e.toString());
        }

        System.out.println(count.getValorAtual());
        //System.out.println(count02.getValorAtual());

        System.out.println("\nFim do programa");
    }
}
