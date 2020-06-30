package poo;

public class Principal {
    public static void main(String[] args) {
    Ponto p1 = new Ponto(2,1);
    Ponto p2 = new Ponto(6,4);
    p1.desenhar();
    p2.desenhar();
    Linha line = new Linha(p1,p2);
        System.out.println(line.tamanhoReta());
     line.desenhar();
    }
}
