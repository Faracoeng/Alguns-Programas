package poo;

public class Principal {
    public static void main(String[] args) {
        Contador count = new Contador();
        Thread comHeranca = new Fluxo1(count);
        Thread comInterface = new Thread(new Fluxo02());
        Thread outraComHeranca = new Fluxo03("terceiraThread");



        comHeranca.run();
        comInterface.run();
        outraComHeranca.run();

        System.out.println(count.getValorAtual());

        System.out.println("\nFim do programa");
    }
}
