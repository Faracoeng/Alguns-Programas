package poo;

import java.util.ArrayList;

public class Agenda {
    // Atributos
    private ArrayList<Contato> contatos = new ArrayList();
    // Metodos

    public Agenda(){
        this.contatos = new ArrayList<>();  //Cria agenda como um ArrayList
    }
    public void addPessoa(Contato p){
        this.contatos.add(p);
    }

}
