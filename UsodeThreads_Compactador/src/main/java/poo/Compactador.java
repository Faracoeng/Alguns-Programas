package poo;

import java.io.File;
import java.util.Random;
import java.time.Duration;
import java.time.Instant;

public class Compactador {

    private boolean multiThread;
    private String caimhoEntrada;
    private String caimhoSaida;
    private File diretorioDeEntrada;


    public Compactador(boolean multiThread, String caimhoEntrada, String caimhoSaida) {
        this.multiThread = multiThread;
        this.caimhoEntrada = caimhoEntrada;
        this.caimhoSaida = caimhoSaida;
    }
    private String[] lerDiretorio(String caminhoDir){ // tratar se nao for passado um diretorio como parametro
        this.diretorioDeEntrada = new File(caminhoDir);
        return this.diretorioDeEntrada.list();
    }

    public void compactar(){
        String caminhos[] = lerDiretorio(this.caimhoEntrada);
//---------------------------------------------------------------------------------------


        if (this.multiThread){  // se for multithread
            Thread threads[] = new Thread[caminhos.length];

           for(int i = 0 ; i < caminhos.length; i++){
               threads[i] = new Processo(this.caimhoEntrada +"/"+caminhos[i],this.caimhoSaida,true);
               //System.out.println("entrada: "+this.caimhoEntrada +"/"+caminhos[i]+" saida: "+this.caimhoSaida);
               threads[i].start();

               BarraProgresso bar = new BarraProgresso(((Processo) threads[i]).getTamArquivo());
               bar.setArqAssociado(caminhos[i]+".zip");
               System.out.println(bar.getArqAssociado());
               //bar.start();
              // bar.draw(); // metodo run vai desenhar (bar.start)

           }
//           for (Thread e : threads) {
//               System.out.println(((Processo) e).getDuracao());
//               System.out.println(((Processo) e).getTamArquivo());
//            }

           // Instant fim = Instant.now();
           // long tempoDecorrido = Duration.between(inicio, fim).toMillis();
           // System.out.println("Duração do processo: " + tempoDecorrido);
        //------------------------------------------------------
//        for (Thread thread : threads) { Sincronizar Threds?
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//----------------------------------------------------------------------------------------

        }else {
           // Instant inicio = Instant.now();
            Thread umaThread = new Processo(this.caimhoEntrada+"/",this.caimhoSaida,false);
            ((Processo)umaThread).setArquivos(caminhos);
            umaThread.start();

            BarraProgresso bar = new BarraProgresso(((Processo) umaThread).getTamArquivo());
           // bar.draw();
            System.out.println(bar.getArqAssociado());
           // bar.start();

//            System.out.println(((Processo) umaThread).getTamArquivo());
//            System.out.println(((Processo) umaThread).getDuracao());

           // Instant fim = Instant.now();
            //long tempoDecorrido = Duration.between(inicio, fim).toMillis();
            //System.out.println("Duração do processo: " + tempoDecorrido);
         }
    }
    public synchronized void gerenciaBarraProgresso(){

    }
}
