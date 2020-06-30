package poo;

public enum ValorCarta{
    AS(1),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5),
    SEIS(6),
    SETE(7),
    OITO(8),
    NOVE(9),
    DEZ(10),
    VALETE(11),
    DAMA(12),
    REI(13);
    private int valorDaCarta;

    ValorCarta(int valor){
        this.valorDaCarta = valor;
    };
    public static ValorCarta getByCodigo(int c){
        for(ValorCarta e: ValorCarta.values()){
            if(c == e.valorDaCarta){
                return e;
            }
        }
        //return null;
        throw new IllegalArgumentException("CÓDIGO INVÁLIDO");
    }
    public int getValor(){
        return this.valorDaCarta;
    }
}

