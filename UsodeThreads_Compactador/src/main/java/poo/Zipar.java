package poo;

import java.io.*;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zipar {
    public static final int BUFFER = 2048;
//
//    public int getContador() {
//        return contador;
//    }
//
//    public void setContador(int contador) {
//        this.contador = contador;
//    }

    private boolean status = false;
    private int contador = 1;

    //private static void addFilesRecursively(ZipOutputStream zipDESaida, File arqParaZipar, String diretorioDoZip) throws IOException {
    private  void addFilesRecursively(ZipOutputStream zipDESaida, File arqParaZipar, String diretorioDoZip) throws IOException {
        this.contador = 1;
        String entryFullPath = diretorioDoZip + "/" + arqParaZipar.getName();

        if (arqParaZipar.isDirectory()) {
            for (File arquivo : arqParaZipar.listFiles()) {
                addFilesRecursively(zipDESaida, arquivo, entryFullPath);
            }
        } else {
            byte data[] = new byte[BUFFER];
            FileInputStream fi = new FileInputStream(arqParaZipar);
            BufferedInputStream origin = new BufferedInputStream(fi, BUFFER);
            zipDESaida.putNextEntry(new ZipEntry(entryFullPath));
            int count;
            int i = 0;
            while ((count = origin.read(data, 0, BUFFER)) != -1) {
                zipDESaida.write(data, 0, count);
                this.contador += count;
                //i++;
                //System.out.println("Recursivo:   "+i+" Arq: "+arqParaZipar.getAbsolutePath()+" tamanho: "+arqParaZipar.length());
            }
            this.contador = 0;
            zipDESaida.closeEntry();
            origin.close();
            fi.close();
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    private static String fixInputOutput(String caminho){
        String[] divisaoDasBarras = caminho.split("/");
        return divisaoDasBarras[divisaoDasBarras.length-1];
    }
   // ------------------------------------------------------------------------------------------------------------------
   private synchronized void gerarBlocos(ZipOutputStream out, BufferedInputStream origin, byte data[]) throws IOException {
       int count;
       while ((count = origin.read(data, 0, BUFFER)) != -1) {
           out.write(data, 0, count);
       }
   }
    // ------------------------------------------------------------------------------------------------------------------

    // ------------------------------------------------------------------------------------------------------------------
   //public static boolean compactarRecursivamente(String pathEntrada, String pathSaida) {
    public boolean compactarRecursivamente(String pathEntrada, String pathSaida) {
       try {
           FileOutputStream dest = new FileOutputStream(pathSaida+"/"+Zipar.fixInputOutput(pathEntrada)+".zip");
           CheckedOutputStream checksum = new CheckedOutputStream(dest, new Adler32());
           ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(checksum));

           this.addFilesRecursively(out, new File(pathEntrada), "");

           out.flush();
           dest.flush();
           out.close();
           dest.close();
           return true;
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
       return false;
   }
    //public static boolean compactarArquivo(String pathEntrada, String pathSaida) {
    public boolean compactarArquivo(String pathEntrada, String pathSaida) {
        this.contador = 1;
        File saida = new File(pathSaida+"/"+Zipar.fixInputOutput(pathSaida +"/"+Zipar.fixInputOutput(pathEntrada)+".zip"));

        if (saida.exists()){
            return false;
        }

        try {
            byte data[] = new byte[BUFFER];
            File f = new File(pathEntrada);
           // File f = new File("/"+Zipar.fixInputOutput(pathEntrada));
            if (f.isDirectory()) {
                return false;
            }
            BufferedInputStream origin = null;
            FileOutputStream dest = null;
            dest = new FileOutputStream(saida); // alterado aqui
            ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest));
            FileInputStream fi = new FileInputStream(f);
            origin = new BufferedInputStream(fi, BUFFER);
            ZipEntry entry = new ZipEntry("/"+Zipar.fixInputOutput(pathEntrada));
            out.putNextEntry(entry);
            int count;
            while ((count = origin.read(data, 0, BUFFER)) != -1) {
                out.write(data, 0, count);
                //this.contador += count;
                //Zipar.attDados(true,saida.getAbsolutePath(),saida.length());
                //i++;
                //System.out.println("Regular:   "+i+" Arq: "+saida.getAbsolutePath()+" tamanho: "+saida.length());
            }
            this.contador = 0;
            origin.close();
            out.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
