import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private ArrayList<Elevador> registro = new ArrayList<Elevador>();
    private int edificio = 0;


    public void indicar(int and, int elev){
        registro.get(elev).setAndarAtual(and);

    }
    public void solicitar(int andar){
        int oElev = 0, dif = 0;
        dif = andar - registro.get(0).getAndarAtual();
        for (Elevador e: registro){
            if(andar == e.getAndarAtual()){
                return ;

            }else {
                if(Math.abs(dif) > Math.abs(e.getAndarAtual() - andar)) {
                    oElev = registro.indexOf(e);
                    dif = e.getAndarAtual() - andar;
                }
                else if(Math.abs(dif) == Math.abs(e.getAndarAtual() - andar)){
                    if(registro.get(oElev).vidaUtil() > e.vidaUtil()){
                        oElev = registro.indexOf(e);
                        dif = e.getAndarAtual() - andar;
                    }else if(registro.get(oElev).vidaUtil() == e.vidaUtil()){
                        if(registro.get(oElev).getAndarAtual() < e.getAndarAtual()){
                            oElev = registro.indexOf(e);
                        }
                    }
                }
            }

         }
    registro.get(oElev).setQualAndarQuerIr(andar);
    }

    public void andares(int qtd) {
        if (qtd > 70 || qtd <= 4){
            System.out.println("Não ultrapasse os limites de andares! ");
        } else {
            edificio = qtd;
        }
    }
    public void elevadores(int qtd){
        if(qtd > 6){
            System.out.println("não ultrapasse o limite de elevadores!");
            return;
        }
        for(int i = 0 ; i < qtd ; i++){
            Elevador e = new Elevador();
            registro.add(e);
        }
    }
    public void estatistica(){

        for (Elevador e:registro) {
            System.out.println("Andar -> " + e.getAndarAtual() + ", número de viagens --> " + e.vidaUtil());
        }
    }
    public void revisao(){
        int i= 0;
        for (Elevador e:registro) {
            i++;
            if(e.vidaUtil() >= 10){
                System.out.println("Elevador " + i);
            }
        }
    }
}
