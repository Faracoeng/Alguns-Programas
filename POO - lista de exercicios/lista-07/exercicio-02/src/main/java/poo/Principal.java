package poo;

public class Principal {
    public static void main(String[] args) {
        Baralho canastra = new Baralho();
        System.out.println(canastra.numeroDeCartas());
        System.out.println(canastra.getCarta().toString());
        System.out.println(canastra.numeroDeCartas());
    }
}
