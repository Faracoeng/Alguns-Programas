package poo;

public class Arqueiro extends Personagem {
    private int habilidade;

    public Arqueiro(int id, String nome, int h) {
        super(id, nome);
        this.habilidade = h;
    }

    @Override
    public void atacar(double intensidade) {

    }
}
