package poo;

import java.io.*;
import java.util.Scanner;

public class Principal {
    private Pessoa[] agenda = new Pessoa[2];

    public void salvarEmDisco(){
        File arquivo = new File("agenda.dat");
        try(FileOutputStream fout = new FileOutputStream(arquivo);ObjectOutputStream oos = new ObjectOutputStream(fout)){

            oos.writeObject(this.agenda);
        }catch (Exception e){
            System.err.println("erro: " + e.toString());
        }
    }
    public void lerDoDisco(){
        File arquivo = new File("agenda.dat");
        try {
            FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin = new ObjectInputStream(fin);

            this.agenda = (Pessoa[]) oin.readObject();

            oin.close(); //fechando fluxo de entrada
            fin.close(); //fechando arquivo

            for (Pessoa p : this.agenda) {

                p.toString();
            }
        } catch (Exception ex) {
            System.err.println("erro: " + ex.toString());
        }
    }

    public void escrever(String linha) {//throws IOException {

        String nomeArquivo = "teste.txt";

        File arq = new File(nomeArquivo);
        FileWriter fwArquivo = null;
        BufferedWriter bw;
        try {
            if (!arq.exists()) {

                fwArquivo = new FileWriter(arq, !arq.exists()); //parametro do tipo FILE
                bw = new BufferedWriter(fwArquivo);
                bw.write(linha + "\n");
                bw.close();
                fwArquivo.close();


            } else {
                // se true, ele concatena, se false ele cria ou zera o arquivo

                fwArquivo = new FileWriter(arq, true); //parametro do tipo FILE
                bw = new BufferedWriter(fwArquivo);
                bw.write(linha + "\n");
                bw.close();
                fwArquivo.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public void imprimeConteudoArquivo(String nomeArquivo) {
//        File arquivo = new File(nomeArquivo);
//        try {
//            Scanner leitor = new Scanner(arquivo);
//            while (leitor.hasNext()) {
//                String linha = leitor.nextLine();
//                System.out.println(linha);
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//
//    }
    public static void main(String[] args) {

        Principal p = new Principal();
        p.escrever("arquivo.txt");
        //p.imprimeConteudoArquivo("arquivoTeste.txt");

        p.agenda[0] = new Pessoa("joao", "123");
        p.agenda[1] = new Pessoa("maria", "456");
        p.salvarEmDisco();
        p.lerDoDisco();
    }

}
