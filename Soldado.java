public class Soldado {

    //Atributos
    private static int total = 0; // todo soldado possui ciência do total de soldados que existem
    private final String ARMA = "fuzil"; // Sempre fuzil
    private final int DISTANCIA = 1; // Sempre essa distância
    private int dogTag;
    private int posicao = 0;

    //Métodos
    public Soldado(){
        total++;
        dogTag = total;
    }

    public void atacar(String arma) {
        if (arma != "baioneta" && arma != "punho" && arma != "fuzil") {
            System.out.println("tipo de arma inválida");
        }else {
            if (Soldado.getTotal() < 10) {
                System.out.println("Ainda não, esperando o exército ficar maior");
            } else if( Soldado.getTotal() >= 10) {
                System.out.println("Soldado " + this.dogTag + " Atacou com " + arma);
            }
        }
    }

    public void atacar() {
        this.atacar(ARMA);
    }

    public void mover(int dist){
        posicao += dist;
    }

    public void mover(){
        this.mover(DISTANCIA);
    }

    public int getPosicao(){
        return posicao;
    }

    public static int getTotal(){
        return total;
    }

}
