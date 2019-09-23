package poo;
import java.time.LocalDate;


import java.time.LocalDate;

public class Contato {
    // Atributos

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private Telefone telefones;
    private Email emails;

    // Metodos

    public Contato(String n,String s,LocalDate dN){  //Construtor instancia os objetos e atrubui respectivos dados de nome,sobrenome e data de nascimento
        this.nome = n;
        this.sobrenome = s;
        this.dataNascimento = dN;
        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public boolean addTelefone(String r, String n){
        return this.telefones.add(r, n);

    }

    public boolean addEmail(String r, String e){
        return this.emails.add(r, e);                // Mesmo esquema de Telefone()

    }

    public boolean removeTelefone(String r){
       return this.telefones.remover(r);

    }

    public boolean removeEmail(String r){
        return this.emails.remove(r);

    }

    public boolean updateTelefone(String r, String n){
        return this.telefones.update(r, n);

    }

    public boolean updateEmail(String r, String e){ //Igual anteriores

        return this.emails.update(r, e);

    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
