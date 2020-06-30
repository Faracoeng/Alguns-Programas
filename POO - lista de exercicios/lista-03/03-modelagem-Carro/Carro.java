public class Carro{
 // atributos
        private String corPredminante "generic";
        private String placa = "generic";
        private String modelo = "generic";
        private String marca = "generic";
        private boolean portaAberta = false;
        private boolean carroLigado = false;

        // métodos

        public void setCor(String novaCor){
            this.corPredminante = novaCor;
        }
        public String getCor(){
            return this.corPredminante;
        }
        public String getplaca(){
            return this.placa;
        }
        public String getModelo(){
            return this.modelo;
        }
        public String getMarca(){
            return this.marca;
        }
        public boolean abrirPortas(){
            if(portaAberta){
                System.out.println("As portas ja estão abertas");
                return false;
            }
            System.out.println("As portas foram abertas");
            this.portaAberta = true;
            return true;
        }
    public boolean fecharPortas(){
        if(portaAberta){
            System.out.println("As portas foram fechadas");
            this.portaAberta = false;
            return true;
        }
        System.out.println("As portas ja estão fechadas");
        return false;
    }
        public boolean ligarCarro(){
            if(carroLigado){
                System.out.println("O carro ja esta ligado");
                return false;
            }
            System.out.println("O carro foi ligado");
            this.carroLigado = true;
            return true;
        }
    public boolean desligarCarro(){
        if(carroLigado){
            System.out.println("O carro foi desligado");
            this.carroLigado = false;
            return true;
        }
        System.out.println("O carro ja esta desligado");
        return true;
    }


}
