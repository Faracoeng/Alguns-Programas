package poo;

public class Esfera extends Circulo {
    private int z;

    public Esfera(Ponto centro, double raio, int z) {
        super(centro, raio);
        this.z = z;
    }
}
