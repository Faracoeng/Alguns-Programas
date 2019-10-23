public class Elevador {

    private int andarAtual = 0;
    private int viagens = 0;

    public int getAndarAtual() {

        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {

        this.andarAtual = andarAtual;
        viagens++;
    }
    public void setQualAndarQuerIr(int qualAndarQuerIr) {
        this.andarAtual = qualAndarQuerIr;
        viagens++;
    }
    public int vidaUtil(){

        return viagens;
    }
}

