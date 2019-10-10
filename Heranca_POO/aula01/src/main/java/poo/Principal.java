package poo;

import java.util.IdentityHashMap;

public class Principal {
    public static void main(String[] args) {
        Dimensao dim = new Dimensao(5,5,5);
        Telefone intell = new Telefone(1234,"123456789","AX-35",5.5, dim);
        SemFio wireLess = new SemFio(500, "1235458","AX- 36",5.5,dim,5000,5.5, 5);
        Telefone wireLess02 = new SemFio(500, "1235458","AX- 36",5.5,dim,5000,5.5, 5);
        //System.out.println(intell);
         //System.out.println(wireLess);
        //wireLess02.Ola();

        if ( wireLess02 instanceof SemFio){
            SemFio sf = (SemFio) wireLess02;
            System.out.println("Entrou");
        }
        if ( wireLess02 instanceof Telefone){
            SemFio sf = (SemFio) wireLess02;
            System.out.println("Entrou telefone");
        }
        if ( wireLess02 instanceof Object){
            SemFio sf = (SemFio) wireLess02;
            System.out.println("Entrou object");
        }
        wireLess.ruidoBranco();
        ((SemFio)wireLess02).ruidoBranco(); //Importante, para invocar o metodod de uma classe instanciada em uma camada superior da hierarquia
    }
}
