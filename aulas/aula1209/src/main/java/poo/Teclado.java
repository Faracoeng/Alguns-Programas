package poo;

import java.util.Scanner;

public class Teclado {
    private Scanner tec = new Scanner(System.in);
    public int lerNumero(){
        System.out.println("Entre com um número: ");
        boolean flag = true;
        int retorno = 0;
        while(flag){
        try {
            retorno = tec.nextInt();
            flag = false;
        }catch (Exception e) {
           // System.out.println("erro na linha "+e.getStackTrace()[4].getLineNumber() );
            System.out.println("Insira um número válido");
            flag = true;
        }
        }
        return retorno;
    }
    public double divisaoNumeros(int a, int b) {//throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException();
        }
        return (double) a / b;
    }
}
