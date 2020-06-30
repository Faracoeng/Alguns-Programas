package poo;

public class Cubo extends Retangulo {
    private int z;

    public Cubo(Linha[] linhas, int z) {
        super(linhas);
        this.z = z;
    }

    @Override
    public double calculaArea() {
        return 6 * (super.calculaArea() * super.calculaArea());
    }

    @Override
    public void desenhar() {
        for (int i = 0; i < z; i++){
            super.desenhar();
        }
    }
}
