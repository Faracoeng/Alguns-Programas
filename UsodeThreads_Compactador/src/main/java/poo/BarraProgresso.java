package poo;

public  class BarraProgresso extends Thread {

    private static final char progressChar = '#';

    private int atual;
    private final int total;
    private long tamanhoTarefa;
    private String arqAssociado = "";

    public String getArqAssociado() {
        return arqAssociado;
    }

    public void setArqAssociado(String arqAssociado) {
        this.arqAssociado = arqAssociado;
    }

    BarraProgresso(long tamanho) {
        this.atual = 0;
        this.total = 100;
        this.tamanhoTarefa = tamanho;
    }

    public static void limparTelaTerminalVT100(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    synchronized void resetar() {
        atual = 0;
    }

    synchronized float getProgresso() {
        return atual / (float) total;
    }

//    synchronized float progredir() {
//        if (atual < total)
//            atual++;
//        return getProgresso();
//    }

    @Override
    public void run() {
        this.draw();
    }

    private void draw() {
//        int atual, total;
//        synchronized (this) {
//            atual = this.atual;
//            total = this.total;
//        }
        StringBuilder sb = new StringBuilder();
        //--------------------------------------------------------------------------------------
        for (int i = 0; i < this.total; i++) {
            if (i%this.tamanhoTarefa == 0){
                sb.append(progressChar);
            }
            try {
                System.out.print(this.arqAssociado);
                System.out.print(this.getProgresso());
                System.out.print("\r"+i+"% "+sb+"|");
                Thread.sleep(5);
                System.out.print("\r"+i+"% "+sb+"/");
                Thread.sleep(5);
                System.out.print("\r"+i+"% "+sb+"-");
                Thread.sleep(5);
                System.out.print("\r"+i+"% "+sb+"\\");
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\r"+this.total+"% "+sb);
        //--------------------------------------------------------------------------------------
    }
}
