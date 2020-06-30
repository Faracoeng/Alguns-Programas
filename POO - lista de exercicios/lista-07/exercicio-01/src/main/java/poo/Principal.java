package poo;

import java.util.ArrayList;

public class Principal {


//    void abrirFecaharCapota(Veiculo e){
//        if(((Ferrari) e).abrirCapota()){
//            System.out.println("Capota de "+e.nome+" foi aberta");
//        }else System.out.println("Capota de "+e.nome+" ja esta aberta ou o carro esta em velocidade inadequada");
//
//        //metodo fechar capota
//        if(((Ferrari) e).fecharCapota()){
//            System.out.println("Capota de "+e.nome+" foi fechada");
//        }else System.out.println("Capota de "+e.nome+" ja esta fechada ou o carro esta em velocidade inadequada");
//    }


    public static void main(String[] args) {

        Principal obj = new Principal();
        ArrayList<Veiculo> carros = new ArrayList<>();
        Ferrari maranello = new Ferrari("550");
        Pampa pampa = new Pampa("Pampa");
        Panther anfibio = new Panther("Panther");
        carros.add(maranello);
        carros.add(pampa);
        carros.add(anfibio);

        for (Veiculo e : carros) {
//            e.acelerar(10);
//            //System.out.println(e.getVelocidade());
//            e.frear(5);
//            //System.out.println(e.getVelocidade());
//            e.acelerar(15);
            // System.out.println(e.getVelocidade());

            if (e instanceof Ferrari) {

                //metodo abrir/capota capota
                if (((Ferrari) e).abrirCapota()) {
                    System.out.println("Capota de " + e.nome + " foi aberta");
                } else
                    System.out.println("Capota de " + e.nome + " ja esta aberta ou o carro esta em velocidade inadequada");

                //metodo fechar capota
                if (((Ferrari) e).fecharCapota()) {
                    System.out.println("Capota de " + e.nome + " foi fechada");
                } else
                    System.out.println("Capota de " + e.nome + " ja esta fechada ou o carro esta em velocidade inadequada");


            } else if (e instanceof Pampa) {
                // metodo abrir cacamba
                if (((Pampa) e).abrirCacamba()) {
                    System.out.println("Caçamba de " + e.nome + " foi aberta");
                } else
                    System.out.println("Caçamba de " + e.nome + " não foi aberta pois o carro esta em velocidade inadequada");

                //metodo ativar tracao
                if (((Pampa) e).ativarDesativarTracao()) {
                    System.out.println("Tração de " + e.nome + " ativada");
                } else
                    System.out.println("Trção de " + e.nome + " ja esta ativa ou velocidade do veiculo esta incorreta");

            } else if (e instanceof Panther) {
                //metodo abrir/capota capota
                //obj.abrirFecaharCapota(e);
                if (((Panther) e).abrirCapota()) {
                    System.out.println("Capota de " + e.nome + " foi aberta");
                } else
                    System.out.println("Capota de " + e.nome + " ja esta aberta ou o carro esta em velocidade inadequada");

                //metodo fechar capota
                if (((Panther) e).fecharCapota()) {
                    System.out.println("Capota de " + e.nome + " foi fechada");
                } else
                    System.out.println("Capota de " + e.nome + " ja esta fechada ou o carro esta em velocidade inadequada");

                //metodo recolher rodas
                if (((Panther) e).recolherRodas()) {
                    System.out.println("Rodas recolhidas");
                } else System.out.println("Necessário evaziar o lastro antes de recolher as rodas");

                //metodo recolher rodas
                if (((Panther) e).ativarDesativarTracao()) {
                    System.out.println("Tração de " + e.nome + " ativada");
                } else
                    System.out.println("Trção de " + e.nome + " ja esta ativa ou as rodas foram recolhidas, ou a velocidade esta incorreta");


            }
        }
    }
}
