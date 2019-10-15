package poo;

public abstract class Personagem {
    private int id;
    private String nome;

    public Personagem(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public abstract void atacar(double intensidade);

}
