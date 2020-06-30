package poo;

public class Robo {

    //Atributos
    private int areaTotal;
    private int ladoArea;
    private int x;
    private int y;
    private char frente;

    //Métodos

    public Robo(int area, int posx, int posy, char frente) {
        this.areaTotal = area;
        this.x = posx;
        this.y = posy;
        this.frente = frente;
        setArea(area);
    }
    public void setArea(int area) {
        if (area < 0) {
            System.out.println("Valor inválido");
        } else this.areaTotal = area;

        this.ladoArea = this.areaTotal / 2;
        //System.out.println("lado da area: " + ladoArea);

        if (this.x > this.ladoArea) {
            this.x = this.ladoArea;
        }
        if (this.y > this.ladoArea) {
            this.y = this.ladoArea;
        }
    }
    public void setX(int x) {
        if (x <= this.ladoArea && x >= 0) {
            this.x = x;
        } else if (x > this.ladoArea) {
            this.x = this.ladoArea;
        } else this.x = 0;
    }

    public void setY(int y) {
        if (y <= this.ladoArea && y >= 0) {
            this.y = y;
        } else if (y > this.ladoArea) {
            this.y = this.ladoArea;
        } else this.y = 0;
    }

    public void setFrente(char frente) {
        if (frente == 'N') {
            this.frente = 'N';
        } else if (frente == 'S') {
            this.frente = 'S';
        } else if (frente == 'L') {
            this.frente = 'L';
        } else if (frente == 'O') {
            this.frente = 'O';
        } else this.frente = 'N';
    }

    //mover uma casa pra frente sem ultrapassar a area
    public void move() {
        if (this.frente == 'N') {
            this.y++;
        }
        if (this.frente == 'S') {
            this.y--;
        }
        if (this.frente == 'L') {
            this.x++;
        }
        if (this.frente == 'O') {
            this.x--;
        }
        if (this.x > this.ladoArea) {
            this.x = this.ladoArea;
        }
        if (this.y > this.ladoArea) {
            this.y = this.ladoArea;
        }
        if (this.x < 0) {
            this.x = 0;
        }
        if (this.y < 0) {
            this.y = 0;
        }

    }

    public void direta() {
        if (this.frente == 'N') {
            this.frente = 'L';
        } else if (this.frente == 'L') {
            this.frente = 'S';
        } else if (this.frente == 'S') {
            this.frente = 'O';
        } else if (this.frente == 'O') {
            this.frente = 'N';
        }
    }

    public void esquerda() {
        if (this.frente == 'N') {
            this.frente = 'O';
        } else if (this.frente == 'O') {
            this.frente = 'S';
        } else if (this.frente == 'S') {
            this.frente = 'L';
        } else if (this.frente == 'L') {
            this.frente = 'N';
        }
    }

    public String posicaoAtual() {
        String posicao = "(" + Integer.toString(this.x) + "," + Integer.toString(this.y) + "," + this.frente + ")";
        return posicao;
    }

    public void verificaPos() {

        if (this.frente == 'N') {
            System.out.print(" <cima> ");
        }
        if (this.frente == 'S') {
            System.out.print(" <baixo> ");
        }
        if (this.frente == 'L') {
            System.out.print("<direita> ");
        }
        if (this.frente == 'O') {
            System.out.print("<esquerda> ");
        }
    }

    public void planoDeExploracao(String plano) {
        for (int i = 0; i < plano.length(); i++) {
            if (plano.charAt(i) == 'M') {
                move();
                verificaPos();
                System.out.println(posicaoAtual());
            } else if (plano.charAt(i) == 'D') {
                direta();
                verificaPos();
                System.out.println(posicaoAtual());
            } else if (plano.charAt(i) == 'E') {
                esquerda();
                verificaPos();
                System.out.println(posicaoAtual());
            }
        }
    }


}
