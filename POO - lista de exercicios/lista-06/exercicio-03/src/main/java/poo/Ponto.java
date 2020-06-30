package poo;

public class Ponto {
    private int x;
    private int y;

    public Ponto(int posX, int posY) {
        this.x = posX;
        this.y = posY;
    }
    public void desenhar(){
        System.out.println("desenhando um ponto em: " + this.toString());
    }

    @Override
    public String toString() {
        return  "x=" + x +
                ", y=" + y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
