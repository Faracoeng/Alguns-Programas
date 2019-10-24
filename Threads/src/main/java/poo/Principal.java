package poo;

public class Principal {
    public static void main(String[] args) {
        Thread comHeranca = new Fluxo1();
        Thread comInterface = new Thread(new Fluxo02());
        Thread outraComHeranca = new Fluxo03("terceiraThread");

        comHeranca.run();
        comInterface.run();
        outraComHeranca.run();

        System.out.println("\nFim do programa");
    }
}
