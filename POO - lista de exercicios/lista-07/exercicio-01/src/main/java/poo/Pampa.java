package poo;

public class Pampa  extends Veiculo implements TracaoIntegral {

    private boolean cacambaFechada;
    private boolean tracaoIntegral;

    public Pampa(String nome) {
        super(nome);
        this.cacambaFechada = true;
        this.tracaoIntegral = false;
    }

    @Override
    public boolean ativarDesativarTracao() {
        if(this.velocidade == 0) {
            this.tracaoIntegral = !tracaoIntegral;
            return true;
        }else return false;
    }

    public boolean abrirCacamba(){
        if ((cacambaFechada) && (this.velocidade == 0)){
            cacambaFechada = false;
            return true;
        }return false;
    }
}
