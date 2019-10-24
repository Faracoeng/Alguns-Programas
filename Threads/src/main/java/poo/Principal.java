package poo;

public class Principal {
    public static void main(String[] args) {
        Thread comHeranca = new Fluxo1();
        Thread comInterface = new Thread(new Fluxo02());

        comHeranca.run();
        comInterface.run();

        System.out.println("\nFim do programa");
    }
}
