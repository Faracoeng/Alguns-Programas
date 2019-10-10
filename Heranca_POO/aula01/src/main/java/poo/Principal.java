package poo;

import java.util.IdentityHashMap;

public class Principal {
    public static void main(String[] args) {
        Dimensao dim = new Dimensao(5,5,5);
        Telefone intell = new Telefone(1234,"123456789","AX-35",5.5, dim);
        SemFio wireLess = new SemFio(500, "1235458","AX- 36",5.5,dim,5000,5.5, 5);
        //System.out.println(intell);
         System.out.println(wireLess);
    }
}
