package poo;

public class Principal {
    public static void main(String[] args) {
        Arqueiro arq = new Arqueiro(1403,"Archer",2);
        Cavaleiro cavaleiro = new Cavaleiro(1502,"HorsePower");

        arq.mover();
        cavaleiro.mover();
    }
}
