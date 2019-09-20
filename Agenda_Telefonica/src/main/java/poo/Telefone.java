package poo;

import java.util.HashMap;

public class Telefone {

    // Atributos

    private HashMap<String, String> dados;
    private final String telefoneExpressaoRegular = "^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$"; //Expressão regular do formato de telefone

    // Metodos

    public Telefone(){
        dados = new HashMap<>();
    }

    public boolean add(String r, String n){ // r = rotulo de id
                                            // n = número de telefone
        if(!n.matches(telefoneExpressaoRegular)){
            return false;
        }
        //O método matches especifica uma expressão regular e localiza
        // o conteúdo do objeto String em que está sendo aplicada essa expressão. Para saber se essa correspondência
        // foi atendida ou não, é retornado um valor booleano (true ou false).

        if(dados.containsKey(r)){
            return false;
        }
        dados.put(r, n);        //Caso nao exista  r, define n como conteúdo da chave r atual
        return true;
    }

    public boolean remover(String r){
        if(!dados.containsKey(r)){
            return false; //Verifica se existe chave na HashMap
        }
        dados.remove(r);
        return true;
    }

    public boolean update(String r, String n){  // Atualiza algum dados

        if(!this.dados.containsKey(r)) {
            return false;
        }
        dados.put(r, n); //atualizar dado
        return true;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "dados=" + dados +
                ", telefoneExpressaoRegular='" + telefoneExpressaoRegular + '\'' +
                '}';
    }
}
