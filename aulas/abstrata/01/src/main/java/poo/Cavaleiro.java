package poo;

public class Cavaleiro extends Personagem {

    public Cavaleiro(int id, String nome) {
        super(id, nome);
    }

    @Override
    public void atacar(double intensidade) {

    }

    @Override
    public void mover() {
        System.out.println("Movendo 10 unidades");
    }
}
