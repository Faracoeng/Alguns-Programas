package poo;

public class Telefone {
    private int codigo;
    private String numSerie, modelo;
    private double peso;
    private Dimensao dim;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dim) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dim = dim;
    }
    public String olaMundo(){
        return "Ola, eu sou um telefone";
    }
    public void Ola(){
        System.out.println( "Ola, eu sou um telefone");
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", dim=" + dim +
                '}';
    }
}
