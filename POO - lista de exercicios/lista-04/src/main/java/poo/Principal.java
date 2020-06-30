package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Exercicio 01

        Scanner teclado = new Scanner(System.in);
        Retangulo ret = new Retangulo();
        System.out.println("ASCII:");
        ret.desenharASCII();
        ret.setAltura(5);
        ret.setLargura(10);
        System.out.println("NOVO RETÂNGULO");
        System.out.println("UTF8:");
        ret.desenharUTF8();

        //Exercicio 02

        System.out.println("---------------------");
        Robo bumblebee = new Robo(8, 1, 2, 'N');
        System.out.println("Posição inicial: "+bumblebee.posicaoAtual());
        bumblebee.planoDeExploracao("EMEMEMEMM");
        System.out.println("Posição final: " + bumblebee.posicaoAtual());

        //Exercicio 03

        System.out.println("---------------------");
        Soldado exercito [] = new Soldado[10];
        for(int i = 0; i < exercito.length - 1; i++){
            exercito[i] = new Soldado();
        }
        exercito[1].atacar();
        exercito[9] = new Soldado();
        exercito[1].atacar();
        exercito[0].atacar("punho");
        exercito[3].atacar("baioneta");
        exercito[0].mover();
        System.out.println(exercito[0].getPosicao());
        exercito[0].mover(4);
        System.out.println(exercito[0].getPosicao());
    }
}
