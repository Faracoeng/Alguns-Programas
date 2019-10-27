package poo;

public class Carta {

    private ValorCarta valor;
    private Naipe naipe;

    public Carta(ValorCarta valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public ValorCarta getValor() {
        return valor;
    }

    public void setValor(ValorCarta valor) {
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                ", naipe=" + naipe +
                '}';
    }
}
