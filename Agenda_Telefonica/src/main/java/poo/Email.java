package poo;

import java.util.HashMap;

public class Email {
    // Atributos
    private HashMap<String, String> dados;
    private final String emailExpressaoRegular = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    // Metodos

//    private boolean validacaoEmail(String email){
//
//        return email.matches(emailExpressaoRegular);
//    }

    public Email(){
        dados = new HashMap<>();   //  Construtor define Email como uma HashMap
    }

    public boolean add(String r, String e){

        if(!e.matches(emailExpressaoRegular)) return false;   //se e-mail nao for válido
        if(dados.containsKey(r)) return false; //  Se conter a chave "r"
        dados.put(r, e); // então e-mail é adicionado
        return true;
    }

    public boolean remove(String r){
        if(!dados.containsKey(r)){
            return false;    //Se e-mail existir na HashMap
        }
        dados.remove(r);
        return true;
    }

    public boolean update(String r, String e){
        if(!this.dados.containsKey(r)){
            return false;
        }
        this.dados.put(r, e);   //Atualizar dado
        return true;
    }

    @Override
    public String toString() {
        return "Email{" +
                "dados=" + dados +
                ", emailExpressaoRegular='" + emailExpressaoRegular + '\'' +
                '}';
    }
}


