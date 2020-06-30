package poo;

public class Retangulo {
    //atributos
    private double altura;
    private double largura;
    private String saida = "";
    private final String [][] CARACTERES = {{"+", "-", " ", "|", "+", "+", "+"},{"\u250c", "\u2500", "\u2510", "\u2502", "\n", "\u2514", "\u2518"}};
    // Na linha 0 da matriz estão localizados os caracteres relacionados a ASCII
    // Na linha 1 da matriz estão localizados os caracteres relacionados a UTF8
    // O número excessivo do caracter "+" na linha 01 da matriz serve para igualar a quantidade de colunas

    //métodos
    public Retangulo(){
        this.altura = 4;
        this.largura = 4;
    }
    public Retangulo(double h, double l){
        if (validaRetangulo(h,l)) {
            this.altura = h;
            this.largura = l;
        }
    }
    private boolean validaRetangulo(double h, double l){
        if (h >= 1 && l >= 1){
            return true;
        }else System.out.println("Insira valores válidos");
        return false;
    }

    public void setAltura(double altura) {
        if (validaRetangulo(altura,2)) {
            this.altura = altura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (validaRetangulo(2,largura)) {
            this.largura = largura;
        }
    }

    public void desenhar(int linha){  // tornar generico a função deseenhar (linha == 0) desenha ASCII, (linha == 1) desenha UTF8
        for(int i = 0; i < this.altura;i++){
            for (int j = 0; j < this.largura; j++){

            }
        }
    }

    public void desenharASCII(){
        for(int i = 0; i < this.altura;i++){
            for (int j = 0; j < this.largura; j++){
                if ( i == 0 || i == this.altura-1){
                    if (j == 0 || j == this.largura-1){
                        System.out.print("+");
                    }else if(j < this.largura-1 && j > 0 ){
                        System.out.print("-");
                    }
                }else if( j == 0 || j == this.largura-1){
                    System.out.print("|");
                }else System.out.print(" ");

            }
            System.out.println(" ");
        }
    }
    public void desenharUTF8(){
        for(int i = 0; i < this.altura;i++){
            for (int j = 0; j < this.largura; j++){

                if(i == 0){
                    if(j>0 && j < this.largura-1){
                        this.saida += "\u2500";
                    }else if(j == this.largura-1){
                        this.saida += "\u2510";
                    }else this.saida += "\u250c";
                }
                else if(i == this.altura-1){
                    if(j>0 && j < this.largura-1){
                        this.saida += "\u2500";
                    }else if(j == this.largura-1){
                        this.saida += "\u2518";
                    }else this.saida += "\u2514";
                }else{
                    if(j == 0 || j == this.largura-1){
                        this.saida += "\u2502";
                    }else this.saida += " ";
                }
            }
            this.saida += "\n";
        }
        System.out.println(saida);
    }
}
