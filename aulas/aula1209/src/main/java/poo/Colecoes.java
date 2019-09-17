package poo;

import java.util.ArrayList;

public class Colecoes {
    public static void main(String[] args) {
        ArrayList<String> col = new ArrayList<>();
        int n = col.size(); // total de elementos na coleção

        col.add("IFSC");
        col.add("Telecomunicações");

        String s = col.toString();  //[IFSC, Telecomunicações]

        col.remove("Remove"); //remove o elemento

        boolean b = col.contains("IFSC"); // VERIFICANDO SE EXISTE ELEMENTO
        //percorrendo elementos e imprimindo na tela
        col.forEach(System.out::println);   // usa método "reference"
    }
}
