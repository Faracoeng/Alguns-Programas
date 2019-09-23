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

//    public boolean removePessoa(String n, String s){
//        for (Contato e : contatos) {
//            if(e.toString() == n + s){                  // COMPARA RETORNO DO METODO toString(), verificar depois
//                contatos.remove(contatos.indexOf(e));   // Se iguais, remove pessoa associada ao indice atual
//                return true;
//            }
//        }
//        return false;
//    }


    //usar Try/Catch para verificar posições
    public boolean addEmail(String r, String e, int pIndex){
        return contatos.get(pIndex).addEmail(r, e);
    }

    //public boolean addTelefone(String r, String n, int pIndex){}          //implementar

    public boolean updateTelefone(String r, String n, int pIndex){
        return contatos.get(pIndex).updateTelefone(r, n);
    }
    public boolean updateEmail(String r, String e, int pIndex){
        return contatos.get(pIndex).updateEmail(r, e);
    }

    public boolean removeTelefone(String r, int pIndex){
        return contatos.get(pIndex).removeTelefone(r);

    }
    public boolean removeEmail(String r, int pIndex){
        return contatos.get(pIndex).removeEmail(r);
    }
}
