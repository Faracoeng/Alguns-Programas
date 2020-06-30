package poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Baralho {
    private ArrayList<Carta> baralho;

    public Baralho() {
        this.baralho = new ArrayList<>();
        ValorCarta[] valoresCartas = ValorCarta.values();
        Naipe[] naipesCartas = Naipe.values();
        // System.out.println("nCartas: "+valoresCartas.length+" --> nNaipes: "+ naipesCartas.length);

        //13x4 --> 13 cartas de 4 diferentes tipos

        for (int i = 0; i < valoresCartas.length; i++) {
            for (int j = 0; j < naipesCartas.length; j++) {
                baralho.add(new Carta(valoresCartas[i], naipesCartas[j]));
            }

        }
        // System.out.println(baralho.size()); 52 cartas ok!!
    }
    public int numeroDeCartas(){
        return this.baralho.size();
    }

    public Carta getCarta(){
        return this.baralho.remove(this.baralho.size() - 1);
    }
    public void embaralharBaralho(){
        Collections.shuffle(this.baralho);
    }
}
