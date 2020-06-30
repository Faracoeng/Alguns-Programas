package poo;

public class Panther extends Veiculo implements TracaoIntegral,VeiculoAnfibio,Conversivel{

    private boolean tracaoIntegral;
    private boolean capotaAberta;
    private boolean rodasRecolhidas;
    private boolean lastroCheio;
    private int temperaturaRefrigerador;

    public Panther(String nome) {
        super(nome);
        this.tracaoIntegral = false;
        this.capotaAberta = false;
        this.rodasRecolhidas = false;
        this.lastroCheio = false;
        this.temperaturaRefrigerador = 0;
    }

    @Override
    public boolean ativarDesativarTracao() {
        if(!this.rodasRecolhidas) {
            tracaoIntegral = !tracaoIntegral;
            return tracaoIntegral;
        }else return false;
    }

    @Override
    public boolean abrirCapota() {
        if ((capotaAberta) && (this.velocidade == 0)){
            return false;
        }else {
            this.capotaAberta = !capotaAberta;
            return true;
        }
    }

    @Override
    public boolean fecharCapota() {
        if((this.capotaAberta) && (this.velocidade == 0)){
            this.capotaAberta = !capotaAberta;
            return true;
        }else return false;
    }

    @Override
    public boolean recolherRodas() {
        if (rodasRecolhidas){
            return false;
        }else {
            this.rodasRecolhidas = !rodasRecolhidas;
            esvaziarLastro();
            return true;
        }
    }

    @Override
    public boolean abrirRodas() {
        if (rodasRecolhidas){
            this.rodasRecolhidas = false;
            return true;
        }else return false;
    }

    @Override
    public void esvaziarLastro() {
        lastroCheio = false;

    }

    public void setTemperaturaRefrigerador(int temperaturaRefrigerador) {
        if ((temperaturaRefrigerador > 0) && (temperaturaRefrigerador < 20)) {
            this.temperaturaRefrigerador = temperaturaRefrigerador;
        }
    }
}
