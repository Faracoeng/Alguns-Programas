package poo;

public class Ferrari extends Veiculo implements Conversivel {

    private boolean capotaAberta;
    private boolean farolNeblina;

    public Ferrari(String nome) {
        super(nome);
        this.capotaAberta = false;
        this.farolNeblina = false;
    }


    @Override
    public boolean abrirCapota() {
        if((this.capotaAberta) && (this.velocidade == 20)){ // Se a capota ja estiver aberta
            return false;    //retorna false
        }else{//senao
            this.capotaAberta = !capotaAberta; // define capota como "aberta"
            return true;
        }
    }

    @Override
    public boolean fecharCapota() { // logica inversa ao metodo abrirCapota()
        if((this.capotaAberta) && (this.velocidade == 20)){
            capotaAberta = !capotaAberta;
            return true;
        }else return false;
    }

    public boolean ligarFarolNeblina(){
        if (farolNeblina){
            return false;
        }
        farolNeblina = !farolNeblina;
        return true;
    }

}
