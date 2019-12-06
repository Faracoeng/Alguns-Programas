package poo;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Callable;

public class Principal {
    public static void main(String[] args) {

//        //tratar erros

        if(args.length == 3) {
            try {
                //------------------------ tirar barra do final do diretorio de entrada
                if (args[1].charAt(args[1].length() - 1) == '/') {
                    args[1] = args[1].substring(0, args[1].length() - 1);
                }
                //------------------------ tirar barra do final do diretorio de saida
                if (args[2].charAt(args[2].length() - 1) == '/') {
                    args[2] = args[2].substring(0, args[2].length() - 1);
                }
                //-----------------------------------------------------------
                if (args[0].equals("true")) {
                    Compactador obj = new Compactador(true, args[1], args[2]);
                    obj.compactar();
                } else if (args[0].equals("false")) {
                    Compactador obj = new Compactador(false, args[1], args[2]);
                    obj.compactar();
                } else System.out.println("entrada inválida");
            }catch (Exception e){
                System.out.println("erro na linha "+e.getStackTrace()[4].getLineNumber());
                System.out.println("entrada de dados incorreta");
            }
        }
//
//
//    Compactador obj = new Compactador(false,"/home/andre/diretorioTeste","/home/andre/saidasTestePOO");
//   obj.compactar();


    //------------------------desenho--------------------------------

//        BarraProgresso.limparTelaTerminalVT100();
//        System.out.println("Início do exemplo de barra de progresso");
//
//        BarraProgresso.draw();
//        BarraProgresso.limparTelaTerminalVT100();
//        System.out.println("Fim!");

        //------------------------------------------------------------

            // ver a quantidade de arquivos em um determinado File
        // String[] list() : Returns an array of strings naming the files and directories in the directory .
            //Ver tamanho do arquivo
        // long getFreeSpace() : Returns the number of unallocated bytes in the partition .
                                    //OU
        //long length() : Returns the length of the file denoted by this abstract pathname.

    }
}
