package poo;

public interface Carro {
    public static final String nome = "Carro";

    void frear(int intensidade); // Ja é public abstract

    default void desligar(){
        System.out.println("Desligando carro");
    }
}
