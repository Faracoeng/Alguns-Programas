package poo;

public class Cilindro extends Circulo {
    private int z;

    public Cilindro(Ponto centro, double raio, int z) {
        super(centro, raio);
        this.z = z;
    }

    @Override
    public double calculaArea() {
        return this.z * super.calculaArea();
    }

}
