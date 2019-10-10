package poo;

public class SemFio extends Telefone {
    private double frequencia, distancia;
    private int canais;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dim, double frequencia, double distancia, int canais) {
        super(codigo, numSerie, modelo, peso, dim);
        this.frequencia = frequencia;
        this.distancia = distancia;
        this.canais = canais;
    }

    @Override
    public String olaMundo() {
        return super.olaMundo() + "sem fio";
    }

    @Override
    public void Ola() {
        System.out.println("Ola, eu sou um telefone sem fio");
    }

    @Override
    public String toString() {
        return "SemFio{" +
                "frequencia=" + frequencia +
                ", distancia=" + distancia +
                ", canais=" + canais +
                 super.toString();
    }
}
