package poo;
import java.io.File;
import java.time.Duration;
import java.time.Instant;

public class Processo extends Thread {

    private String entrada;
    private String saida;
    private boolean multiThread;
    private String[] arquivos = null;
    private long duracao = 0;
    private long tamArquivo = 0;
    private Zipar zip = new Zipar();

    public Processo (String caimhoEntrada, String caimhoSaida, boolean muilt){
        this.entrada = caimhoEntrada;
        this.saida = caimhoSaida;
        this.setName(caimhoEntrada);
        this.multiThread = muilt;

        this.tamArquivo = new File(caimhoEntrada).length();
    }


    public void run(){
        Instant inicio = Instant.now();
        if(multiThread) {
            if(zip.compactarArquivo(this.entrada, this.saida)){
                this.setName("from: "+this.getEntrada()+"to: "+this.saida);
                //System.out.println(zip.getContador());  // ------> aqui
            }else {
                zip.compactarRecursivamente(this.entrada, this.saida);
                this.setName("from: "+this.getEntrada()+"to: "+this.saida);
                //System.out.println(zip.getContador());  // ------> aqui
            }
        } else{
            for(int i = 0 ; i < this.arquivos.length; i++){
                if (zip.compactarArquivo(this.entrada+"/"+this.arquivos[i] , this.saida)) {
                    this.setName("from: "+this.getEntrada()+"to: "+this.saida);
                    //System.out.println(zip.getContador());  // ------> aqui
                } else {
                    zip.compactarRecursivamente(this.entrada+"/"+this.arquivos[i] , this.saida);
                    this.setName("from: "+this.getEntrada()+"to: "+this.saida);
                    //System.out.println(zip.getContador());  // ------> aqui
                }
            }
        }
        Instant fim = Instant.now();
        System.out.println("duração do processo: "+this.entrada+" foi de: "+Duration.between(inicio, fim).toMillis()+" milissegundos");
        this.duracao = Duration.between(inicio, fim).toMillis();
    }

//public void run(){
//     Instant inicio = Instant.now();
//    if(multiThread) {
//       if(Zipar.compactarArquivo(this.entrada, this.saida)){
//           this.setName("from: "+this.getEntrada()+"to: "+this.saida);
//       }else {
//           Zipar.compactarRecursivamente(this.entrada, this.saida);
//           this.setName("from: "+this.getEntrada()+"to: "+this.saida);
//       }
//    } else{
//        for(int i = 0 ; i < this.arquivos.length; i++){
//            if (Zipar.compactarArquivo(this.entrada+"/"+this.arquivos[i] , this.saida)) {
//                this.setName("from: "+this.getEntrada()+"to: "+this.saida);
//            } else {
//                Zipar.compactarRecursivamente(this.entrada+"/"+this.arquivos[i] , this.saida);
//                this.setName("from: "+this.getEntrada()+"to: "+this.saida);
//                }
//        }
//    }
//     Instant fim = Instant.now();
//    System.out.println("duração do processo: "+this.entrada+" foi de: "+Duration.between(inicio, fim).toMillis()+" milissegundos");
//    this.duracao = Duration.between(inicio, fim).toMillis();
//}
    public void setArquivos(String[] arquivos) {
        this.arquivos = arquivos;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSaida() {
        return saida;
    }

    public long getDuracao() {
        return duracao;
    }

    public long getTamArquivo() {
        return tamArquivo;
    }
}
