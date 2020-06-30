package poo;

public class Linha {
    private Ponto p1;
    private Ponto p2;

    public Linha(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public void desenhar(){
        System.out.println("Desenhando uma reta nos pontos: "+ this.toString());
    }

    @Override
    public String toString() {
        return "p1=" + p1 +
               ", p2=" + p2 +
                '}';
    }
    public double tamanhoReta(){
       return Math.sqrt(((this.p2.getX() - this.p1.getX()) *(this.p2.getX() - this.p1.getX())) + ((this.p2.getY() - this.p1.getY()) * (this.p2.getY() - this.p1.getY())));
        //return ((this.p2.getX() - this.p1.getX()) *(this.p2.getX() - this.p1.getX())) + ((this.p2.getY() - this.p1.getY()) * (this.p2.getY() - this.p1.getY()));
        //return ((this.p2.getY() - this.p1.getY()) * (this.p2.getY() - this.p1.getY()));
    }
}
