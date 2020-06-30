package poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa ("Joao", "Silva" , LocalDate.of(1990,01,01)," "," "," "," "));
        pessoas.add(new Pessoa ("Ana",  "Paula" , LocalDate.of(1989,01,01)," "," "," "," "));
        pessoas.add(new Pessoa ("Joao", "Santos", LocalDate.of(1991,01,01)," "," "," "," "));
        pessoas.add(new Pessoa ("Joao", "Silva" , LocalDate.of(1980,01,01)," "," "," "," "));
        System.out.println("PRIMEIRAAAAAAAAAAAAAAAAAAAAAAA---------------------");
        System.out.println(pessoas); // imprimir ́a exatamente igual a ordem que foram adicionados
        Collections.sort(pessoas); // ou ainda,  pessoas.sort(Comparator.naturalOrder());
        System.out.println("SEGUNDAAAAAAAAAAAAAAAAAAAAAAAA---------------------");
        System.out.println(pessoas);
    }
}
