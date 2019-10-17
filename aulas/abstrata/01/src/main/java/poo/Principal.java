package poo;

public class Principal {
    public static void main(String[] args) {
        Arqueiro arq = new Arqueiro(1403,"Archer",2);
        Cavaleiro cavaleiro = new Cavaleiro(1502,"HorsePower");
        arq.mover();
        cavaleiro.mover();

        Personagem vetP[] = new Personagem[4];
        vetP[0] = new Arqueiro(1456,"Arq",45);
        vetP[1] = new Cavaleiro(1234,"cava");
        vetP[2] = new Cavaleiro(1578,"cava02");
        vetP[3] = new Arqueiro(1456,"Arq02",45);
        for (Personagem e : vetP){
            System.out.println(e.getNome()+": ");
            e.mover();
        }
    }
}
