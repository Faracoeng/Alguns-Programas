package poo;

public abstract class Veiculo {
    protected String nome;
    protected int velocidade; //Em [km/h]

    public Veiculo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean frear(int i){
        if(this.velocidade >= 0) {
            this.velocidade -= i;
            return true;
        }else return false;
    }
    public boolean acelerar(int i){
        this.velocidade += i;
        return true;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
